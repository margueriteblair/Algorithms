public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
            int t1 = 0;
            int t2 = 0;
            int t3 = 0;
            
            for (int i : h1) {
                t1 += i;
            }
            for (int i : h2) {
                t2 += i;
            }
            for (int i : h3) {
                t3 += i;
            }

            if (h1.size() == 0 || h2.size() == 0 || h3.size() == 0) {
                return 0;
            }
            
            if (t1 == t2 && t2 == t3) {
                return t1;
            } else {
                if (t1 > t2 && t1 > t3) {
                    h1.remove(0);
                    return equalStacks(h1, h2, h3);
                } else if (t2 > t1 && t2 > t3) {
                    h2.remove(0);
                    return equalStacks(h1, h2, h3);
                } else {
                    h3.remove(0);
                    return equalStacks(h1, h2, h3);
                }
            }
    
        }

        public static int equalStacks2(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
            // Write your code here
             int sum1=0, sum2=0 , sum3=0;
            for(int i=0 ; i<h1.size() ; i++)
            {
                sum1=sum1+h1.get(i);
            }
                for(int i=0 ; i<h2.size() ; i++)
            {
                sum2=sum2+h2.get(i);
            }
                for(int i=0 ; i<h3.size() ; i++)
            {
                sum3=sum3+h3.get(i);
            }
            int n=1;
            while(n!=0)
            {
                if(sum1==sum2 && sum2==sum3)
                {
                    n=0;
                    return sum1;
                }
                else if(sum1>=sum2 && sum1>=sum3)
                {
                    int val=h1.remove(0);
                    sum1=sum1-val;
                    continue;
                }
                else if(sum2>=sum1 && sum2>=sum3)
                {
                    int val=h2.remove(0);
                    sum2=sum2-val;
                    continue;
                }
                else if(sum3>=sum1 && sum3>=sum1)
                {
                    int val=h3.remove(0);
                    sum3=sum3-val;
                    continue;
                }
                else return 0;
            }
            return 0;
        
            }
        
        }
}