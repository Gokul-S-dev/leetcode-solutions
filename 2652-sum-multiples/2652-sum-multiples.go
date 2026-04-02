func sumOfMultiples(n int) int {
    var sum , i int;
    for i=1;i<=n;i++ {
        if i%3==0 || i%5==0 || i%7==0 {
            sum+=i;
        }
    }
    return sum;
}