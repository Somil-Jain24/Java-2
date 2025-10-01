import java.util.*; 
public class greatertoright {
    public static int[] solve(int[] arr){
        // handle empty/null array
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;

        for(int i = arr.length-2;i>=0;i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i] = -1;
            }
            else
            nge[i] = st.peek();

            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element ");
        int count = 0;
    while (count < n) {
        if (s.hasNextInt()) {
            arr[count++] = s.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            s.next(); // Skip invalid input
        }
    }

        System.out.println(Arrays.toString(solve(arr)));

    }
}
