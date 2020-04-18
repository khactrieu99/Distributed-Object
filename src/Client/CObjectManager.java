package Client;

import Server.SObjectManager;

public class CObjectManager {
    public static int createRemoteObject(String className) {
        return SObjectManager.createRemoteObject(className);
    }

    public static boolean setAttributeValue(int handle, String attributeName, String value){
        return SObjectManager.setAttributeValue(handle, attributeName, value);
    }

    public static String getAttributeValue(int handle, String attributeName) {
        return SObjectManager.getAttributeValue(handle, attributeName);
    }

    public static String executeMethod(int handle, String methodName, String params) {
        return SObjectManager.executeMethod(handle, methodName, params);
    }
}
