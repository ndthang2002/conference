# spring framework 

```
 spring : 
 - la mot he sinh thai 
 spring boot : cấu hình tự động 
  - dễ dàng tạo ứng sụng độc lập chỉ cần chạy thôi ( môt web app điển hình cần 4 bước : đóng gói , chọn máy chủ , cấu hình máy chủ , chọn 1 trình duyệt và chạy)
  -
```

```
  @Configuration :bao hieu rang class do se duoc su dung de cau hinh;
  @Bean : dinh nghia do la 1 bean

  @component :  chuc nang giong nhu @bean , de bieu thi 1 class la mot bean 
  @service bieu thi do la lop phu thuoc co chuc nang dich vu
  @repository : bieu thi do la lop phu thuoc co chuc nang kho luu tru (day la class thuc hien cac chuc nang crud,.vv.. )
  
```

```
 factoryBean : trien khai ma tinh
   - Singleton : gioi han so lan tao doi tuong , chi tao 1 ;
   builder 
```

```
@Entity (name ..) tu dong anh xa voi table trong database
@JsonIgnore được sử dụng ở cấp trường để đánh dấu các thuộc tính hoặc danh sách bị bỏ qua

@JsonIgnoreProperties được sử dụng ở cấp độ lớp để đánh dấu 1 thuộc tính hoặc danh sach các thuộc tính bị bỏ qua 
```

```
 @RestControllerAdvice : annotation này sẽ gắn trên class có tác dụng xen vào quá trình xử lý của các restController .thường nó được sử dụng với @ỄcptionHandler 
```