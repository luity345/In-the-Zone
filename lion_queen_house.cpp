#include <iostream>
#include <string>

using namespace std;

int main() 
{
    // start of program
    string str;
    cout << "Welcome to the Zone!\n\n" << "What is your name?" << endl;
    cin >> str;

    cout << "\nCool, " << str << "!\nLet's get started!" << endl;

    int x;
    int y;

    x = 10;
    y = 20;

    x = x + y;
    y = x - y;
    x = x - y;

    cout << "\nI have two variables now.\nThe value of x = " << x << endl;
    cout << "The value of y = " << y << endl;

    int t;
    cout << "\nWhat value do you want to give to t? " << endl;
    cin >> t;

    int sum;
    sum = x + y + t;

    cout << "\nThe sum of x, y, and t is " << sum << endl;

    double avg;
    avg = sum / 3.0;

    cout << "\nThe average of x, y, and t is " << avg << endl;

    int z;
    cout << "What is the value of z? " << endl;
    cin >> z;

    int prod;
    prod = x * y * t * z;

    cout << "\nThe product of x, y, t, and z is " << prod << endl;

    int rem;
    rem = prod % 5;

    cout << "\nThe remainder after dividing the product by 5 is " << rem << endl;

    if (x == 10 && y == 20) 
    {
        cout << "\nThe values of x and y are still the same!" << endl;
    }
    else 
    {
        cout << "\nThe values of x and y have changed!" << endl;
    }

    int a;
    int b;
    int c;

    a = 15;
    b = 15;
    c = 25;

    if (a == b) 
    {
        a = c;
        b = c;
    }
    else if (a > b) 
    {
        a = 10;
        b = 20;
    }
    else 
    {
        a = 30;
        b = 40;
    }

    cout << "\nThe value of a is now " << a << endl;
    cout << "The value of b is now " << b << endl;

    int num1;
    int num2;
    int num3;

    cout << "\nEnter three numbers: " << endl;
    cin >> num1 >> num2 >> num3;

    int min;

    if (num1 <= num2 && num1 <= num3) 
    {
        min = num1;
    }
    else if (num2 <= num1 && num2 <= num3) 
    {
        min = num2;
    }
    else 
    {
        min = num3;
    }

    cout << "\nThe lowest number of the three is " << min << endl;

    int max;

    if (num1 >= num2 && num1 >= num3) 
    {
        max = num1;
    }
    else if (num2 >= num1 && num2 >= num3) 
    {
        max = num2;
    }
    else 
    {
        max = num3;
    }

    cout << "\nThe highest number of the three is " << max << endl;

    int h;
    int m;
    int s;

    cout << "\nEnter the time in hours, minutes, and seconds: " << endl;
    cin >> h >> m >> s;

    int total;
    total = (h * 3600) + (m * 60) + s;
    cout << "\nThe total time in seconds is " << total << endl;

    int n;
    cout << "\nWhat is the value of n? " << endl;
    cin >> n;

    int result;
    result = (n + 1) * (n + 2) * (n + 3);

    cout << "\nThe result of (n + 1) x (n + 2) x (n + 3) is " << result << endl;

    int p;
    int q;
    int r;

    cout << "\nEnter three numbers for p, q, and r: " << endl;
    cin >> p >> q >> r;

    int num;
    num = (p * q) + (r * q);

    cout << "\nThe result of (p x q) + (r x q) is " << num << endl;

    int k;
    cout << "\nWhat is the value of k? " << endl;
    cin >> k;

    int sq;
    sq = k * k;

    cout << "\nThe square of k is " << sq << endl;

    int l;
    cout << "\nWhat is the value of l? " << endl;
    cin >> l;

    int cube;
    cube = l * l * l;

    cout << "\nThe cube of l is " << cube << endl;

    int a1;
    int a2;
    int a3;
    int a4;

    cout << "\nEnter four numbers for a1, a2, a3, and a4: " << endl;
    cin >> a1 >> a2 >> a3 >> a4;

    int mean;
    mean = (a1 + a2 + a3 + a4) / 4;

    cout << "\nThe mean of a1, a2, a3, and a4 is " << mean << endl;

    int g;
    int h1;
    int i;

    cout << "\nEnter three numbers for g, h, and i: " << endl;
    cin >> g >> h1 >> i;

    int exp;
    exp = g * h1 * i;

    cout << "\nThe result of g x h x i is " << exp << endl;

    double d;
    cout << "\nWhat is the value of d? " << endl;
    cin >> d;

    double sqroot;
    sqroot = sqrt(d);

    cout << "\nThe square root of d is " << sqroot << endl;

    int j;
    cout << "\nWhat is the value of j? " << endl;
    cin >> j;

    int cubroot;
    cubroot = cbrt(j);

    cout << "\nThe cube root of j is " << cubroot << endl;

    int e;
    int f;

    cout << "\nWhat is the value of e? " << endl;
    cin >> e;

    cout << "\nWhat is the value of f? " << endl;
    cin >> f;

    int sum1;
    sum1 = e + f;

    cout << "\nThe sum of e and f is " << sum1 << endl;

    int diff;
    diff = e - f;

    cout << "\nThe difference between e and f is " << diff << endl;

    double div;
    div = e / f;

    cout << "\nThe result of e divided by f is " << div << endl; 

    int g1;
    int h2;

    cout << "\nWhat is the value of g? " << endl;
    cin >> g1;

    cout << "\nWhat is the value of h? " << endl;
    cin >> h2;

    int mult;
    mult = g1 * h2;

    cout << "\nThe result of g x h is " << mult << endl; 

    int o;
    int p1;
    int q1;
    int r1;

    cout << "\nEnter four numbers for o, p, q, and r: " << endl;
    cin >> o >> p1 >> q1 >> r1;

    int mod;
    mod = (o + p1 + q1 + r1) % 4;

    cout << "\nThe remainder after dividing the sum of o, p, q, and r by 4 is " << mod << endl;

    int s1;
    cout << "\nWhat is the value of s? " << endl;
    cin >> s1;

    int find;
    find = s1 % 7;

    cout << "\nThe remainder after dividing s by 7 is " << find << endl;

    int u;
    int v;
    int w;

    cout << "\nEnter three numbers for u, v, and w: " << endl;
    cin >> u >> v >> w;

    int result1;
    result1 = (u * v) - (w * u);

    cout << "\nThe result of (u x v) - (w x u) is " << result1 << endl;

    double three;
    cout << "\nWhat is the value of 3? " << endl;
    cin >> three;

    double one;
    one = three / 3.0;

    cout << "\nThe result of 3 divided by 3 is " << one << endl; 

    return 0;
}