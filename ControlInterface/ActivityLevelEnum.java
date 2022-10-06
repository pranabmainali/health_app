package ControlInterface;

public enum ActivityLevelEnum {
    
    SEDENTARY("SEDENTARY", 1.2),
    LIGHTLY("LIGHTLY", 1.3),
    MODERATELY("MODERATELY",1.55),
    VERY_ACTIVE("VERY_ACTIVE",1.725),
    EXTRA_ACTIVE("EXTRA_ACTIVE",1.7);
    
    public String stringValue;
    public double multiplyFactor;
    
    private ActivityLevelEnum(String stringValue, double multiplyFactor){
        this.stringValue = stringValue;
        this.multiplyFactor = multiplyFactor;
    }
    
}
