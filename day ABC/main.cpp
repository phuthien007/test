#include <iostream>
#include <string>
using namespace std;
/** tao chuoi do dai n sao cho 2 chuoi con bat ki lien ke nhau thi khac nhau
 */

int n;
string a;
string s[]={'A','B','C'}; // cac ky tu co the dung them vao chuoi
void result(){
    for(int i=0;i<n;i++)
       cout<<a[i];
       cout<<endl;
}
bool check(int n,char s[]) // ham kiem tra xem co 2 chuoi con bat ki noi tiep nhau co bang nhau khong
{
        for(int i=0;i<n-1;i++) // kiem tra cac chuoi con co 1 ki tu
         if(s[i]==s[i+1]) return false;
        for(int i=2;i<=n/2;i++) // ham tang do dai chuoi con can kiem tra
            for(int j=0;j<=n-i;j++) // ham chay vi tri bat dau kiem tra 2 chuoi con lien ke do dai i
        {   int k=j;
            while(s[k]==s[k+i]) k++;
            if(k-j==i) return false;
        }
        return true;
}
void Try(int k){
    for(int i=0;i<s.length();i++){
        a[k]=s[i];
        if(check(k+1,a)==false) k=k-1; // tai dinh phan tu thu k;
        if(k==n-1) result();
        else Try(k+1);
    }
}
int main(){
   cin>>n;// nhập độ dài n cần tạo
   Try(0);
   return 0;
}
