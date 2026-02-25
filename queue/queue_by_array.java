class queue {
    int[] arr = new int[5];
    int f = -1, r = -1 , size = 0;

    void add(int val) {
        if(r == arr.length -1){
            System.out.println("Queue is overflow ");
            return;
        }
        if(r== -1 && f ==-1){
            r = f = 0;
            arr[r] = val;
            size++;
        }else{
            arr[++r] = val;
            size++;
        }

    }

    int remove() {
        if(r == -1) {
            System.out.println("Queue is UnderFlow ");
            return -1;
        }
            int val = arr[f];
            f++;
            size-- ;
        
        return val;

    }

    int size() {
        return size;
    }

    int peek(){
        return arr[f];
    }

    void print() {
        for (int a = f; a <= r; a++) {
            System.out.print(arr[a] + " ");
        }
    }

}

public class queue_by_array {
    public static void main(String[] args) {
        queue q = new queue();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size());
        q.print();
    }

}