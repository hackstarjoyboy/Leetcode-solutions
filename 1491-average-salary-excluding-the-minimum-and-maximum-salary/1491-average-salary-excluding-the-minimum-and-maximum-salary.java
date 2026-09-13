class Solution {
    public double average(int[] salary) {
        int n=salary.length-2;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double totalSalary=0;
        for(int num:salary){
            totalSalary+=num;
        if(num>max){
            max=num;
        }
        if(num<min)
        {
            min=num;
        }
        }
    double adjustedSalary=totalSalary-(min+max);

       
    return adjustedSalary/(salary.length-2);
    }
}