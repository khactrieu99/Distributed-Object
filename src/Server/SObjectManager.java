package Server;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class SObjectManager {

    public static int nextAvailableHandle = 1;
    public static Map<Integer, SObject> objects = new HashMap();

    public static int register(SObject sObject) {
        int handle = nextAvailableHandle++;
        objects.put(handle, sObject);
        return handle;
    }

    public static SObject getObjectByHandle(int handle) {
        if(objects.containsKey(handle)) {
            return objects.get(handle);
        }
        return null;
    }

    public static int createRemoteObject(String className) {
        int handle = 0;
        SObject obj = null;

        switch (className) {
            case "SMan":
                obj = new SMan();
                break;
        }

        if(obj != null) {
            handle = obj.handle;
        }

        return handle;
    }

    public static boolean setAttributeValue(int handle, String attributeName, String value) {
        SObject sObject = getObjectByHandle(handle);
        if(sObject != null) return sObject.setAttributeValue(attributeName, value);

        return false;
    }

    public static String getAttributeValue(int handle, String attributeName) {
        SObject sObject = getObjectByHandle(handle);
        if(sObject != null) return sObject.getAttributeValue(attributeName);
        return "N/A";
    }

    public static String executeMethod(int handle, String methodName, String params) {
        SObject sObject = getObjectByHandle(handle);
        if(sObject != null) return sObject.executeMethod(methodName, params);
        return "N/A";
    }
}
