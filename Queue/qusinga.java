class que{
    int size = 10;
    int[] q = new int[10];
    int currsize = 0;
    int start = -1;
    int end = -1;

    public int push(int n){
        if(currsize >= size){
            return -1;
        }
        if(currsize == 0 ){
            start =0;
            end =0;
        }else
        end = (end+1)%size;
        q[end] = n;
      
        currsize++;
        return 0;

    }

    public void show(){
        for(int i = 0; i < size; i ++){
            System.out.print(q[i]+ " ");
        }
    }

    public int pop(){

        if(currsize == 0){
        return -1;    
        }
        int cl = q[start];
        if(currsize == 1){
            start = end = -1;
            currsize --;
            return cl;
        }
        else
            start = (start+1)%size;
            currsize --;
            return cl;
        
    }

}

public class qusinga {
    public static void main(String[] args) {
        
        que q = new que ();
        q.push(10);
        q.push(100);
        q.push(1);
        q.push(11);
        q.push(18);
        q.push(14);
        q.push(19);
        q.push(107);
        q.push(17);
        q.push(18);
        q.show();
        System.out.println();

        q.pop();
        q.show();
    }

}
