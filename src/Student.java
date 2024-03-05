public class Student {
    private String studentID;
    private String studentName;
    private String[]extraActivities;

    public Student(String studentID,String studentName,int numberOfActivities){
        this.studentID=studentID;
        this.studentName=studentName;
        this.extraActivities=new String[numberOfActivities];
    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID=studentID;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    
    }
    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void addExtraActivity(String activity, int index) {
        if (index >= 0 && index < this. extraActivities.length) {
            this.extraActivities [index] = activity;
        }
    }
    public String toString() {
        StringBuilder sb=new StringBuilder( ) ;
        sb.append("Student ID:").append(studentID)
          .append("\nName:" ).append(studentName)
          .append("\nExtra Activities: " ) ;
          for (String activity : extraActivities) {
            if (activity != null) {
                sb.append(activity).append(", ");
            }
        }
        return sb. toString();
    }
}