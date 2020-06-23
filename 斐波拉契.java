    /**
     * 采用遍历的方式实现
     * 时间复杂度为O(N)
     * @param n
     * @return
     */
    public static int f2(int n){
        int f0 = 0;
        if (n == 0) {
            return f0;
        }
        int f1 = 1;
        if (n == 1) {
            return f1;
        }
        int f2 = 0;
        for (int i=2; i<=n; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
