// question no 1 to 50 //

import java.util.*;

public class taskVijendra {
    public void question1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
            if(arr[i] != i+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("All Are there");
        sc.close();
    }
    public void question2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Total: " + sum);
        System.out.println("Avg: " + sum/n);
        sc.close();
    }
    public void question3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n-1 ; ++j){
                if(arr[j] == 0){
                    arr[j] ^= arr[j+1]; 
                    arr[j+1] ^= arr[j]; 
                    arr[j] ^= arr[j+1]; 
                }
            }
        }
        for(int i = 0 ; i < n ; ++i){
            System.out.print(arr[i] + " ");
        }System.out.println();
        sc.close();
    }
    public void question4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; ++i){
            if(arr[i] == k){
                arr[i] ^= arr[n-1]; 
                arr[n-1] ^= arr[i]; 
                arr[i] ^= arr[n-1];
                break; 
            }
        }
        
        for(int i = 0 ; i < n-1 ; ++i){
            System.out.print(arr[i] + " ");
        }System.out.println();
        sc.close();
    }
    public static void question5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        ArrayList<Integer> eve= new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            int a = sc.nextInt();
            // boolean num = ();
            if(a%0 != 0){
                odd.add(a);
            }else {
                eve.add(a);
            }
        }
        System.out.print("Odd Number : ");
        for(Integer i : odd){
            System.out.print(i);
        }System.out.println();
        
        System.out.print("Even Number : ");
        for(Integer i : eve){
            System.out.print(i);
        }System.out.println();
        
        sc.close();
    }
    public static void question6(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            int a = sc.nextInt();
            arr.add(a);
        }
        for(int i = 0 ; i < m ; ++i){
            int a = sc.nextInt();
            brr.add(a);
        }
        for(int i = 0 ; i < m ; ++i){
            arr.add(brr.get(i));
        }
        System.out.print("Array : ");
        for(Integer i : arr){
            System.out.print(i);
        }System.out.println();

        sc.close();
    }
    public static void question7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
        sc.close();
    }
    public static void question8(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        String arr[] = new String[n];
        int number = 0 , str = 0;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextLine();
            if(arr[i].charAt(0) >= 'A'){
                str++;
            }else number++;
        }
        System.out.println("String : " + str);
        System.out.println("Number : " + number);

        sc.close();
    }
    public static void question9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; ++i){
            ans.add(arr[i]);
            for(int j = i + 1 ; j < n ; ++j){
                if(arr[i] != arr[j]){
                    i = j;
                    break;
                }
            }   
        }
        if(ans.get(ans.size()-1) != arr[n-1]){
            ans.add(arr[n-1]);
        }
        for(Integer i : ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
    
    public static void question10(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Largest : " + arr[arr.length-2]);
    }
    public static void question11(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Smallest : " + arr[1]);
    }
    public static void question12(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest : " + arr[0]);
    }
    public static void question13(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        int zer  = 0 , pos = 0 , neg = 0;
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) zer++;
            else if(arr[i] > 0) pos++;
            else neg++;
        }
        System.out.println("Zero : " + zer);
        System.out.println("Positive : " + pos);
        System.out.println("Negative : " + neg);
    }
    public static void question14(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        char arr[] = new char[n];
        int zer  = 0 , pos = 0 , neg = 0;
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextLine().charAt(0);
        }
        for(char i : arr){
            System.out.println(i);
        }
    }
    public static boolean isPrime(int a) {
        for(int i = 2 ; i < a ; ++i ){
            if(a % i == 0){
                return true;
            }
        }
        return false;
    }
    public static void question15(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i]= sc.nextInt();
            if(isPrime(arr[i])) System.out.println(arr[i] + " : Is Prime");
            else System.out.println(arr[i] + " : Not Prime");
        }
    }
    public static void question16(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int num = sc.nextInt() ;

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
            if(num == arr[i]){
                System.out.println(i);
            }
        }
    }
    public static void question17(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int num = sc.nextInt() ;
        
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        int s = 0;
        int e = n-1;
        
        int mid = s+(e-s)/2;
        while( s <= e){
            int midd = arr[mid];

            if(midd == num){
                System.out.println("Element find At : " + mid);
                return;
            }else if(num>midd){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        System.out.println("Element Not Found");
    }
    
    
    public static void question18(){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,5,3};
        Arrays.sort(arr);
        int maxi = 5;
        int ans[] = new int[maxi+1];
        for(int i = 0 ; i < arr.length ; ++i){
            ans[arr[i]]++;
        }
        for(int i = 0 ; i < ans.length ; ++i){
            if(ans[i] >= 2){
                System.out.println(i+1 + " --> " + ans[i]);
            }
        }
    }
    public static void question19a(){
        Scanner sc = new Scanner(System.in);

        int arr[] = {-1, -2, 3, 3, -2};
        for(int i = 0 ; i < 5 ; ++i){
            boolean flag = true;
            for(int j = 0 ; j < 5  ; ++ j){
                if(arr[j] == arr[i] && i != j){
                    flag = false;
                }
            }
            if(flag) System.out.println(arr[i]);
        }
    }
    public static void question19(){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = {-1, -2, 3, 3, -2,9};

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            if(i.getValue() == 1){
                System.out.println(i.getKey());
            }
        }
    }
    public static void question20(){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = {5, 5, 2, 2, 2, 4, 4, 1, 7, 1};

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            if((i.getValue()%2 == 0)){
                System.out.println(i.getKey());
            }
        }
    }
    public static void question21(){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = {5, 5, 2, 2, 2, 4, 4, 1, 7, 1};

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
            if((i.getValue()%2 != 0)){
                System.out.println(i.getKey());
            }
        }
    }
    public static void question22(){
        int[] arr = {2,1,4,4,5,7};

        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i]%2 == 0 && i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void intiTemp(int temp[]){
        for(int i = 0 ; i < temp.length ; ++i){
            temp[i] = -1;
        }
    }
    public static void intiTemp(ArrayList<Integer> ans){
        for(int i = 0 ; i < ans.size() ; ++i){
            ans.remove(i);
        }
    }
    public static void question23(){
        int arr[] = {5, 6, 3, 0, 7, 8, 9, 1, 2,100};
        int n = arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            ArrayList<Integer> temp= new ArrayList<>();
            int j = 0;
            for(j = i ; j < arr.length-1 ; ++j){
                if(arr[j+1] >= arr[j]){
                    temp.add(arr[j]);
                }else {
                    temp.add(arr[j]);
                    break;
                }
            }
            if(temp.size() > ans.size()){
                ans.clear();
                for(int ind : temp){
                    ans.add(ind);
                }
            }
        }
        for(int i : ans ){
            System.out.print(i + " ");
        }
    }
    public static void question24(){
        int arr[] = {5, 6, 3, 0, 7, 8, 9, 1, 2,100};
        int n = arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            ArrayList<Integer> temp= new ArrayList<>();
            int j = 0;
            for(j = i ; j < arr.length-1 ; ++j){
                if(arr[j+1] < arr[j]){
                    temp.add(arr[j]);
                }else {
                    temp.add(arr[j]);
                    break;
                }
            }
            if(temp.size() > ans.size()){
                ans.clear();
                for(int ind : temp){
                    ans.add(ind);
                }
            }
        }
        for(int i : ans ){
            System.out.print(i + " ");
        }
    }
    public static void question25(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans= new ArrayList<>();
        while(n-- >= 0){
            String s = sc.nextLine();
            ans.add(s);
        }
        ans.sort(null);
        for(String i : ans) System.out.print(i + " ");
    }
    public static void question26(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while(arr[j] != 0){
            j++;
        }
        while(j < n){
            if(arr[j] == 0 ){
                if(arr[i] != 0){
                    arr[i] ^= arr[j];
                    arr[j] ^= arr[i];
                    arr[i] ^= arr[j];
                }else {
                    i++;
                }
            }else {
                j++;
            }
        }
        for(int k = 0 ; k < n ; ++k ) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void question27(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int i = n-1, j = n-1;
        while(arr[j] != 0){
            j--;
        }
        while(j >= 0){
            if(arr[j] == 0 ){
                if(arr[i] != 0){
                    arr[i] ^= arr[j];
                    arr[j] ^= arr[i];
                    arr[i] ^= arr[j];
                }else {
                    i--;
                }
            }else {
                j--;
            }
        }
        for(int k = 0 ; k < n ; ++k ) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void unionn( int arr1[] , int arr2[] , int m , int n ){

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++]);
            else {
                    System.out.print(arr2[j++] + " ");
                    i++;
                }
            }
            
            /* Print remaining elements of the larger array */
            while (i < m)
            System.out.print(arr1[i++] + " ");
            
            while (j < n)
                System.out.print(arr2[j++] + " ");
        
        

    }
    public static void inter(int arr1[], int arr2[],int n, int m){
        for(int i = 0 ; i < m; i++){ 
            for(int j = 0; j <n ; j++){
                if(arr1[i]==arr2[j]){
                    System.err.print(arr1[i] + " ");
                }
            }
        }
    }
    public static void question28(){
        int arr[] = {1,2,3,4,5};
        int arr2[] = {5,3,6,7,9};
        int n = arr.length;
        int m = arr2.length;
        System.out.println("Union");
        unionn(arr, arr2, m, n);
        System.out.println();
        System.out.println("Intersaction");
        inter(arr, arr2, n, m);
    }
    public static void question29(){
        List<Integer> arr = Arrays.asList(5, 10, 20, 15);

        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
    }
    public static void question30(){
        List<Integer> arr = Arrays.asList( -12, 11, -13, -5, 6, -7, 5, -3, -6);

        Collections.sort(arr);
        for(int i : arr) 
            System.out.print(i + " ");
    }
    public static void question31(){
        List<Integer> arr = Arrays.asList( 1, 4, 20, 3, 10, 5);

        int target = 33;
        for(int i = 0 ; i < arr.size() ; ++i){
            int sum = 0;
            // System.out.println("i " + i);
            for(int j = i ; j < arr.size() ; ++j) {
                // System.out.println("j " + j);
                sum += arr.get(j);
                // System.out.println("sum " + sum);
                if(sum == target){
                    System.out.println(i + " " + j);
                }else if(sum > target){
                    break;
                }
            }
        }
    }
    public static void question32(){
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for(int i = 0 ; i < arr.length ; ++i){
            indexMap.put(arr[i], indexMap.getOrDefault(arr[i], 0) + 1);
        }

        for(int i = 0 ; i < arr.length ; ++i){
            for (Map.Entry<Integer, Integer> entry : indexMap.entrySet()) {
                if (entry.getValue() >= 2 && entry.getKey() == arr[i]) {
                    System.out.println("Ans " + entry.getKey());
                    return;
                }
            }
        }
        System.out.println("No Element");
    }
    public static int kadanes(int[] arr) {
        int n = arr.length;
        
        if (n == 0) {
            return 0;
        }
        
        int maxH = arr[0];
        int minH = arr[0];
        int maxSoFar = arr[0];
        
        for (int i = 1; i < n; i++) {
            int currentElement = arr[i];
            
            if (currentElement < 0) {
                // Swap max and min when current element is negative
                int temp = maxH;
                maxH = minH;
                minH = temp;
            }
            
            maxH = Math.max(currentElement, maxH * currentElement);
            minH = Math.min(currentElement, minH * currentElement);
            
            maxSoFar = Math.max(maxSoFar, maxH);
        }
        
        return maxSoFar;
    }
    public static void question33(){
        int[] arr = {6, -3, -10, 0, 2};
        System.out.println(kadanes(arr)); 

        
    }
    public static void question34(){
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        
        for(int i = 0 ; i < arr.length ; ++i){
            for(int j = i + 1 ; j < arr.length ; ++j){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; ++i){
            System.out.print(arr[i] + " ");
        }

        
    }
    public static void question36(){
        int arr[] = {-20, 34, 21, -87, 92, 2147483647};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int  i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            } 
        }
        System.out.println(max);
        System.out.println(min);

        
    }
    public static void question37(){
        String arr[] = {"one", "two", "three", "four", "five"};
        
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            String c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        
        
        
        for(  i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
    public static void question38(){
        int arr[] = {3,6,5,2,1,4,5};
        int target = 3;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("index : " + i);
            }
        }
    }
    public static void question39(){
        int arr[] = {3,6,5,2,1,4,5};
        int target = 3;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target)
                continue;

            System.out.print(arr[i] + " ");
        }
    }
    public static void question40(){
        int[][] matrixA = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        
        int[][] matrixB = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        
        
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Number of columns in matrixA must be equal to number of rows in matrixB");
            return;
        }
        
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void question41(){
        Scanner sc = new Scanner(System.in);
        int totSubjects = sc.nextInt();
        System.out.println("Enter marks out of: ");
        int outOf = sc.nextInt();
        int totalMarks = totSubjects * outOf;
        int n = totSubjects;
        int studTotMarks = 0;
        while(n-- != 0){
            System.out.println("Enter Subject Marks : ");
            int marks = sc.nextInt();
            studTotMarks += marks;
        }
        double percentage = (double) studTotMarks / totalMarks * 100;
        String division;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50) {
            division = "Second Division";
        } else if (percentage >= 40) {
            division = "Third Division";
        } else {
            division = "Fail";
        }
        System.out.println("Percentage : " + percentage + " " + division);
    }
    public static void question42(){
        List<Integer> arr = Arrays.asList( 45, 25, 69, 40);

        Collections.sort(arr);
        System.out.println(arr.get(arr.size() - 2));
    }
    public static void question43(){
        List<Integer> arr = Arrays.asList( 45, 25, 69, 40);

        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
    public static void question44(){
        question13();
    }
    public static void question45(){
        int arr[] = new int[10];
        System.out.println(arr.length);
    }
    public static boolean primeOrNott(int ind ) {
        for(int i = 2 ; i < ind ; ++i) {
            if (ind % i == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void question46(){
        int arr[] = {10, 11, 13, 15, 17, 19, 23, 25, 30};
        for(int i = 0 ; i < arr.length ; ++i){
            if (primeOrNott(arr[i])) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
    public static void question47(){
        // No Question || question not available 
    }
    public static void question48(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i <  n ; ++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest : " + arr[arr.length-1]);
        System.out.println("Second Largest : " + arr[arr.length-2]);
    }
    public static void question49(){
        question5();
    }
    public static void question50(){
        question23();
    }

    public static void main(String [] a) {
        question47();
    }
}