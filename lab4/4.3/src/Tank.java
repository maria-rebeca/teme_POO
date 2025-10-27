public class Tank {
    private int maxCapacity;
    private int currentFillingLevel;

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentFillingLevel(int currentFillingLevel) {
        if(currentFillingLevel > this.maxCapacity) {
            this.maxCapacity = currentFillingLevel;
        }
        else{
            this.currentFillingLevel = currentFillingLevel;
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentFillingLevel() {
        return currentFillingLevel;
    }

    public void fillTheTank(int gas){
        setCurrentFillingLevel(getCurrentFillingLevel()+gas);
    }

    public void emptyTheTank(int gas){
        setCurrentFillingLevel(getCurrentFillingLevel()-gas);
    }
}
