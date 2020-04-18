package Server;

public class SMan extends SObject{
    private int height;
    private String name;

    public SMan() {
        super();
    }
    @Override
    public boolean setAttributeValue(String attributeName, String value) {
        switch (attributeName) {
            case "Height":
                height = Integer.parseInt(value);
                return true;
            case "Name":
                name = value;
                return true;
        }
        return false;
    }

    @Override
    public String getAttributeValue(String attributeName) {
        switch (attributeName) {
            case "Height":
                return String.valueOf(height);
            case "Name":
                return name;
        }
        return "N/A";
    }

    @Override
    public String executeMethod(String methodName, String params) {
        switch (methodName) {
            case "Height Jugde":
                return heightJudge();
        }

        return "N/A";
    }

    public String heightJudge() {
        if(height >= 180) return "Tall";
        if(height >= 165) return "Normal";
        return "Short";
    }
}
