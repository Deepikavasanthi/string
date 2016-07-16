{Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
        int[] a=new int[n];int i,j,c=0;
        for(i=2;i<n;i++)
          {             
            for( j=2;j<i;j++)
            {
                if(i%j==0)
                {
                  break;
                }     
            }
            if(i==j)
            {
                a[c]=i;
                c++;
          }
               
            }
              System.out.println("the prime count is"+c);
          }  