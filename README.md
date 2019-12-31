## Information management system based on SpringBoot + Mybatis (Course Project)

### Main technologies used:：
- Project building with maven
- Use Springboot + Mybatis to build the entire system
- Plot statistics graphs using libraries like E-charts (Main goal in the second semester)
- Use framework Bootstrap, JQuery to develop User Interface
- Use MySQL and MongoDB to store data and pictures separately
- Using Redis cache to improve database query performance



### Question: How to start the system?
1. Run the sql file in MySQL to generate tables and data, start the Redis service, and selectively enable MongoDB (it will report an error when it is not opened, but it will not affect the normal access of the system. MongoDB needs to be started when using the photo upload function)
2. Finally, directly start the Application class and visit [http: // localhost: 8080 / user / login] (http: // localhost: 8080 / user / login) to enter the system!
### images: 
Including Histogram, Rectangle tree graph, Pie chart, Scatter plot, line chart, China map and radar chart.
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/1.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/2.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/3.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/4.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/5.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/6.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/7.png)
![Image text](https://raw.githubusercontent.com/xcy25813/FBMS/master/img/8.png)

### Divided into four modules:


-** User Management Module **
: User login, registration, password retrieval (by email), user information modification, password modification

-** Dashboard Management Module **
: Display the current monthly income and its chain ratio (ring ratio = (current monthly income-last month's income) / last month's income), the current monthly order number and its ring ratio, website visits, the current monthly return order and its ring ratio, The form of a graph (using the jquery plugin) shows the daily income and orders in the last 30 days

-** Commodity Management Module **
: Product addition, deletion, modification, search, product picture import (stored in MongoDB), export of product reports, product classification addition, deletion, modification, inventory check, inventory shortage and inventory reminder, product recovery and recovery

-** Order Management Module **
: Order inquiry, order refund management (view and approval), shipping management, logistics company management, courier tracking (calling the courier 100 interface)

### Optimization:
1. Calculate and print the time-consuming logs of various methods by using AOP, which is beneficial for subsequent code optimization
2. Implementing anti-SQL injection through interceptors to prevent users from entering SQL-sensitive strings
