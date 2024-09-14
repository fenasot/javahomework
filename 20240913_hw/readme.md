# 20240913作業

## 一、日期排序

args
----
### args[0] class名稱 : 

固定為 sort

### args[1] 根據輸入的ymd順序排序，預設為 ymd :

ymd 或 myd 或 dmy 都可
### args[2] 降序 true | 升序 false : 

預設為降序，輸入true以外的文字都將被當false


使用方式
----

使用預設值
``` terminal
java -jar P20240913_homework3-0.0.1-SNAPSHOT.jar sort 
```

自訂排序
``` terminal
java -jar P20240913_homework3-0.0.1-SNAPSHOT.jar sort myd false 
```

## 二、大樂透
args
----
### args[0] class名稱 : 

固定為 bingo

### args[1] 輸入兩個特別數字 :
當作最近兩期的頭獎特別號碼

### args[2] 輸入十二個普通數字 : 

當作最近兩期的頭獎普通號碼


使用方式
----

數字超過規定或少於規定數量會報錯
``` terminal
java -jar P20240913_homework3-0.0.1-SNAPSHOT.jar bingo "1 4" "3 6 14 26 40 44 23 15 36 7 2 5"
```