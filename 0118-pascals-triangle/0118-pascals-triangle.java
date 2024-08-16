class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {

             List<List<Integer>> l=new ArrayList<>();

             List<Integer> first_row=new ArrayList<>();

             first_row.add(1);// first row
             l.add(first_row);


             for(int i=1;i<numRows;i++)
             {
                List<Integer> prev_row=l.get(i - 1);
                List<Integer> curr_row=new ArrayList<>();

                curr_row.add(1); // first element always 1


                for(int j=1;j<i;j++)
                {
                    curr_row.add(prev_row.get(j-1)+prev_row.get(j)); // middle elements

                }

                curr_row.add(1); // last element always 1

                l.add(curr_row);
             }

             return l;

    }
}