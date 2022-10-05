package ControlInterface;

public enum ActivityLevelEnum {
    
    SEDENTARY(1.2),
    LIGHTLY(1.3),
    MODERATELY(1.55),
    VERY_ACTIVE(1.725),
    EXTRA_ACTIVE(1.7);
    
    public double multiplyFactor;
    
    private ActivityLevelEnum(double multiplyFactor){
        this.multiplyFactor = multiplyFactor;
    }
    
}
