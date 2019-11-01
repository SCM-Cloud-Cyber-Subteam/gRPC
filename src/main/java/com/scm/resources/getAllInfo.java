package main.java.com.scm.resources;


import javafish.clients.opc.component.OpcGroup;
import javafish.clients.opc.component.OpcItem;
import javafish.clients.opc.exception.*;
import javafish.clients.opc.variant.Variant;
import javafish.clients.opc.browser.*;
import javafish.clients.opc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class getAllInfo {

    private JOpc jopc = new JOpc("localhost", "RSLinx OPC Server", "JOPC1");



    /**
     * @param tagNameGiven a user inputed tag name to request data from
     * @return a JSON Object with data type and value
     */
    @SuppressWarnings("unchecked")
    public JSONObject getTag(String tagNameGiven, String groupName) {

        try {
            JOpc.coInitialize();
        }
        catch (CoInitializeException e1) {
            e1.printStackTrace();
        }

        //create item with given tag name
        OpcItem item1 = new OpcItem(tagNameGiven, true, groupName);

        //create opc group
        OpcGroup group = new OpcGroup("group1", true, 500, 0.0f);
        group.addItem(item1);

        //connect to OPC to register group/item
        try {

            //add group given
            jopc.addGroup(group);

            //connect to opc
            jopc.connect();


            //register group given
            jopc.registerGroup(group);

            //register given item to given group
            jopc.registerItem(group, item1);

            //read tag from server
            OpcItem itemRead = null;
            itemRead = jopc.synchReadItem(group, item1);

            jopc.unregisterGroup(group);

            String name = Variant.getVariantName(itemRead.getDataType());

            //create new JSONObject to store tag info
            JSONObject jObj = new JSONObject();
            //add client handle
            jObj.put("clientHandle", itemRead.getClientHandle());
            //add item name
            jObj.put("itemName", itemRead.getItemName());
            //add item  activity
            jObj.put("active", itemRead.isActive());
            //add access path
            jObj.put("accessPath", itemRead.getAccessPath());
            //add time stamp
            jObj.put("timeStamp", itemRead.getTimeStamp().getTime());
            //add item data type
            jObj.put("dataType", name);
            //add item value
            jObj.put("value", itemRead.getValue());
            //add item quality
            jObj.put("quality", itemRead.isQuality());

            return jObj;

        }
        catch (ConnectivityException e) {
            e.printStackTrace();
        }
        catch (ComponentNotFoundException e) {
            e.printStackTrace();
        }
        catch (UnableAddGroupException e) {
            e.printStackTrace();
        }
        catch (UnableAddItemException e) {
            e.printStackTrace();
        }
        catch (SynchReadException e) {
            e.printStackTrace();
        }
        catch (CoUninitializeException e) {
            e.printStackTrace();
        } catch (UnableRemoveGroupException e) {
            e.printStackTrace();
        }

        JOpc.coUninitialize();

        return null;
    }
    /**
     * @param groupNamesGiven
     * @param tagNamesGiven
     * @return an ArrayList of tags with their values
     */
    @SuppressWarnings("unchecked")
    public JSONArray getTags(String[] tagNamesGiven, String[] groupNamesGiven) {
        try {
            JOpc.coInitialize();
        }
        catch (CoInitializeException e1) {
            e1.printStackTrace();
        }

        //create items with given tag names
        ArrayList<OpcItem> items = new ArrayList<OpcItem>();
        for(int i = 0; i<tagNamesGiven.length;i++) {
            items.add(new OpcItem(tagNamesGiven[i], true, groupNamesGiven[i]));
        }

        //create opc group
        OpcGroup group = new OpcGroup("group1", true, 500, 0.0f);
        for(int i = 0;i<items.size();i++) {
            group.addItem(items.get(i));
        }

        //connect to OPC to register group/item
        try {

            //add given group
            jopc.addGroup(group);

            //connect to opc
            jopc.connect();


            //register given group
            jopc.registerGroup(group);

            //register each tag to group
            for(int i = 0;i<items.size();i++) {
                jopc.registerItem(group, items.get(i));
            }

            //read tags and create JSONArray to hold information
            OpcItem itemRead = null;
            JSONArray jarr = new JSONArray();
            for(int i=0;i<items.size();i++) {
                //read data
                itemRead = jopc.synchReadItem(group, items.get(i));

                String name = Variant.getVariantName(itemRead.getDataType());

                //store data in json object then json array
                JSONObject jObj = new JSONObject();
                //add client handle
                jObj.put("clientHandle", itemRead.getClientHandle());
                //add item name
                jObj.put("itemName", itemRead.getItemName());
                //add item  activity
                jObj.put("active", itemRead.isActive());
                //add access path
                jObj.put("accessPath", itemRead.getAccessPath());
                //add time stamp
                jObj.put("timeStamp", itemRead.getTimeStamp().getTime());
                //add item data type
                jObj.put("dataType", name);
                //add item value
                jObj.put("value", itemRead.getValue());
                //add item quality
                jObj.put("quality", itemRead.isQuality());
                jarr.add(jObj);
            }
            jopc.unregisterGroup(group);
            return jarr;



        }
        catch (ConnectivityException e) {
            e.printStackTrace();
        }
        catch (ComponentNotFoundException e) {
            e.printStackTrace();
        }
        catch (UnableAddGroupException e) {
            e.printStackTrace();
        }
        catch (UnableAddItemException e) {
            e.printStackTrace();
        }
        catch (SynchReadException e) {
            e.printStackTrace();
        }
        catch (CoUninitializeException e) {
            e.printStackTrace();
        } catch (UnableRemoveGroupException e) {
            e.printStackTrace();
        }


        JOpc.coUninitialize();

        return null;

    }
    /**
     *
     * param  double array tagsAndGroups
     * @return an ArrayList of tags with their values
     */
    @SuppressWarnings("unchecked")
    public JSONArray getTags(String[][] tagsAndGroups) {
        try {
            JOpc.coInitialize();
        }
        catch (CoInitializeException e1) {
            e1.printStackTrace();
        }

        //create items with given tag names
        ArrayList<OpcItem> items = new ArrayList<OpcItem>();
        for(int i = 0; i<tagsAndGroups.length;i++) {
            items.add(new OpcItem(tagsAndGroups[i][0], true,tagsAndGroups[i][1]));
        }

        //create opc group
        OpcGroup group = new OpcGroup("group1", true, 500, 0.0f);
        for(int i = 0;i<items.size();i++) {
            group.addItem(items.get(i));
        }

        //connect to OPC to register group/item
        try {

            //add given group
            jopc.addGroup(group);

            //connect to opc
            jopc.connect();


            //register given group
            jopc.registerGroup(group);

            //register each tag to group
            for(int i = 0;i<items.size();i++) {
                jopc.registerItem(group, items.get(i));
            }

            //read tags and create JSONArray to hold information
            OpcItem itemRead = null;
            JSONArray jarr = new JSONArray();
            for(int i=0;i<items.size();i++) {
                //read data
                itemRead = jopc.synchReadItem(group, items.get(i));

                String name = Variant.getVariantName(itemRead.getDataType());

                //store data in json object then json array
                JSONObject jObj = new JSONObject();
                //add client handle
                jObj.put("clientHandle", itemRead.getClientHandle());
                //add item name
                jObj.put("itemName", itemRead.getItemName());
                //add item  activity
                jObj.put("active", itemRead.isActive());
                //add access path
                jObj.put("accessPath", itemRead.getAccessPath());
                //add time stamp
                jObj.put("timeStamp", itemRead.getTimeStamp().getTime());
                //add item data type
                jObj.put("dataType", name);
                //add item value
                jObj.put("value", itemRead.getValue());
                //add item quality
                jObj.put("quality", itemRead.isQuality());
                jarr.add(jObj);
            }

            jopc.unregisterGroup(group);
            return jarr;



        }
        catch (ConnectivityException e) {
            e.printStackTrace();
        }
        catch (ComponentNotFoundException e) {
            e.printStackTrace();
        }
        catch (UnableAddGroupException e) {
            e.printStackTrace();
        }
        catch (UnableAddItemException e) {
            e.printStackTrace();
        }
        catch (SynchReadException e) {
            e.printStackTrace();
        }
        catch (CoUninitializeException e) {
            e.printStackTrace();
        } catch (UnableRemoveGroupException e) {
            e.printStackTrace();
        }


        JOpc.coUninitialize();

        return null;

    }


    /**
     *
     * @param groupName
     * @return array of tag names in given group
     */
    public List<String> getAvailableTagsInGroup(String groupName) {

        JOpcBrowser browser = new JOpcBrowser("localhost", "RSLinx OPC Server", "BROWSER");

        try {
            JOpcBrowser.coInitialize();
        }
        catch(CoInitializeException e) {
            e.printStackTrace();
        }

        //try connecting to JOPCBrowser and return all online tags in given group
        try {
            browser.connect();
            browser.getOpcBranch("");
            String[] items = browser.getOpcItems(groupName + ".Online", true);
            if(items.length == 0) {
                List<String> noItems = new ArrayList<String>();
                noItems.add("All tags are offline in " + groupName);
            }
            return Arrays.asList(items);
        }
        catch(ConnectivityException | UnableBrowseLeafException | UnableIBrowseException | UnableAddGroupException | UnableAddItemException | UnableBrowseBranchException e) {
            e.printStackTrace();
        }

        JOpcBrowser.coUninitialize();


        List<String> noItems = new ArrayList<String>();
        noItems.add("There are no existing items in this group");
        return noItems;

    }

    /**
     *
     *
     * @return an array of group names
     */
    public List<String> getExistingGroups() {

        JOpcBrowser browser = new JOpcBrowser("localhost", "RSLinx OPC Server", "JOPCBROWSER1");

        try {
            JOpcBrowser.coInitialize();
        }
        catch(CoInitializeException e) {
            e.printStackTrace();
        }

        //try connecting to JOPCBrowser and return all branches
        try {
            browser.connect();
            String[] groups = browser.getOpcBranch("");
            return Arrays.asList(groups);
        }
        catch(ConnectivityException | UnableBrowseBranchException | UnableIBrowseException e) {
            e.printStackTrace();
        }

        JOpcBrowser.coUninitialize();

        List<String> noGroups = new ArrayList<String>();
        noGroups.add("There are no existing groups");
        return noGroups;

    }
    /**
     * param String of file path where file will be stored
     * param JSONArray of tag values
     * @write information to a file
     */
    public String writeTagsToFile(String filePath, JSONArray tags)throws IOException {
        //try to find file path to write to and write tags to file
        try(FileWriter f = new FileWriter(filePath)){
            for(int i = 0;i<tags.size();++i) {
                f.write(tags.get(i).toString() + System.getProperty("line.separator"));
            }
        }
        return"File successfully created at " + filePath;
    }

    /**
     *
     * @param TagFilePath
     * @param GroupFilePath
     * @return a double array containing tag names and groups
     * @throws IOException
     */
    public String[][] readTagsFromFile(String TagFilePath, String GroupFilePath)throws IOException {
        List<String> tags = new ArrayList<String>();
        List<String> groups = new ArrayList<String>();
        String tag,group;
        //try to find file path and read tags from given file
        try(FileReader rTags = new FileReader(TagFilePath)){
            int t;
            while((t=rTags.read()) != -1) {
                tag="";
                while(t != 32) {
                    tag = tag + (char)t;
                }
                tags.add(tag);
            }
        }
        //try to find file path and read groups from given file
        try(FileReader rGroups = new FileReader(GroupFilePath)){
            int g;
            while((g=rGroups.read()) != -1) {
                group = "";
                while(g != 13) {
                    group = group + (char)g;
                }
                groups.add(group);
            }
        }
        //put tags and groups into a double string array
        String[][] tagsAndGroups = new String[tags.size()][2];
        for(int i = 0;i<tags.size();++i) {
            tagsAndGroups[i][0] = tags.get(i);
            tagsAndGroups[i][1] = groups.get(i);
        }
        return tagsAndGroups;
    }
    /**
     *
     * param TagFilePath
     * param GroupFilePath
     * @return a double array containing tag names and groups
     * @throws IOException
     **/
    public String[][] readTagsFromFile(String TagsAndGroupsFilePath)throws IOException {
        List<String> tags = new ArrayList<String>();
        List<String> groups = new ArrayList<String>();
        String tag,group;
        //try to find file path and read tags from given file
        try(FileReader rTagsGroups = new FileReader(TagsAndGroupsFilePath)){
            int c,g,t;
            while((c=rTagsGroups.read()) != -1) {
                tag="";
                group="";
                while((g=rTagsGroups.read())!= 93) {
                    group = group+(char)g;
                    if(g == 91) {
                        group = "";
                    }
                }
                groups.add(group);
                while((t=rTagsGroups.read())!= 13 && t!= -1) {
                    tag = tag + (char)t;
                }
                tags.add(tag);
            }
        }
        //put tags and groups into a double string array
        String[][] tagsAndGroups = new String[tags.size()][2];
        for(int i = 0;i<tags.size();++i) {
            tagsAndGroups[i][0] = tags.get(i);
            tagsAndGroups[i][1] = groups.get(i);
        }
        return tagsAndGroups;
    }




}
