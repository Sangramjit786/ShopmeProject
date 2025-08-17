# Shopme E-Commerce Project  

This repository ([ShopmeProject](https://github.com/Sangramjit786/ShopmeProject.git)) contains a **Spring Boot + Spring Data JPA + Spring Security + Thymeleaf** powered multi-module application that implements a complete e-commerce solution with admin, customer, and seller functionalities.  

The project covers everything from **user management, product catalog, shopping cart, checkout, payments, reports, deployment, and AWS integration**.  
Below is the step-by-step documentation of all 239 development points.  

---
### Key Actors for Project:
<img width="996" height="515" alt="image" src="https://github.com/user-attachments/assets/fa4a5d09-7a2e-461c-83f2-4f4dcf4c7bb7" />

### Visitor's Use Case:
<img width="567" height="307" alt="image" src="https://github.com/user-attachments/assets/8b57a1e9-9f70-4692-b7ef-3ce7a2b0ba56" />

### Use Case for Customer:
<img width="811" height="485" alt="image" src="https://github.com/user-attachments/assets/9c221d96-4ee1-43d0-846d-885e32afba94" />

### Use Case for Editor:
<img width="610" height="461" alt="image" src="https://github.com/user-attachments/assets/c3ddc3e9-8b57-42bf-9878-4e22248f7b25" />

### Use Case for SalesPersons:
<img width="755" height="445" alt="image" src="https://github.com/user-attachments/assets/79026c52-475c-47ee-8e35-ddb220fc2863" />

### Use Case for Assistants:
<img width="470" height="317" alt="image" src="https://github.com/user-attachments/assets/4450b600-cd1e-4bd8-bf60-d737f97ee2e7" />

### Use Case for Shippers:
<img width="616" height="303" alt="image" src="https://github.com/user-attachments/assets/0fa10b0e-d51f-402a-b240-b4903529fb92" />

### Use Case for Administrators:
<img width="636" height="325" alt="image" src="https://github.com/user-attachments/assets/99858696-98aa-46a4-9dd8-96b9f3f2da27" />

### Project Structure:
<img width="927" height="572" alt="image" src="https://github.com/user-attachments/assets/3fefa9f4-0ea0-45e9-bba1-4722234ed53f" />

### Multi-Module Project Structure:
<img width="667" height="452" alt="image" src="https://github.com/user-attachments/assets/61ba138f-f461-453a-8db6-88ca2306e365" />

### Application Architecture:
<img width="851" height="558" alt="image" src="https://github.com/user-attachments/assets/90ada381-b298-4559-9370-8f77dcd288a7" />

---

## 📌 Development Journey

### Project Setup & Architecture  
1. **Create a Multi-Module Project** – Setup backend and frontend modules under one Maven structure.  
2. **Understand Application Architecture** – Defined layered architecture (Controller, Service, Repository, Entity).  
3. **Understand Requirement for Admin Home Page** – Designed dashboard for admin with stats & navigation.  
4. **Using jQuery and Bootstrap** – Added responsive frontend with Bootstrap & jQuery.  
5. **Add Logo and Create Header Menu** – Built reusable Thymeleaf header fragment.  
6. **How to Test on Your Mobile Phone** – Enabled LAN/WiFi testing of local app.  
7. **Understand Requirement of User Management Module** – Planned CRUD & authentication features for users.  
8. **Understand Technical Design for User Module** – Designed entity-relational mappings for user/roles.  
9. **Spring Data JPA Update** – Applied latest JPA & Hibernate configs.  
10. **Create Database and Configure Data Source** – Setup MySQL datasource in application.properties.  

### User Management Core  
11. **Code Role Entity, Role Repository and Unit Test** – Implemented role-based access.  
12. **Code User Entity, User Repository and Unit Tests** – Added user persistence & tested queries.  
13. **Code Users Listing Function** – Displayed users in paginated table.  
14. **Code New User Function** – Enabled adding users with role selection.  
15. **Spring Security** – Integrated Spring Security for authentication/authorization.  
16. **Encode User Password** – Implemented BCrypt hashing for secure storage.  
17. **Check Uniqueness of User Email** – Prevented duplicate accounts.  
18. **Using Fontawesome for Icons** – Improved UI with iconography.  
19. **Code Update User Function** – Edit user details with validations.  
20. **Code Delete User Function** – Soft delete with confirmation modal.  

### Advanced User Features  
21. **Code Update User Enabled Status** – Toggle user activity without deletion.  
22. **Code User Photos Upload Function** – Profile image upload with resizing.  
23. **Fix Images Not Displayed** – Solved static resource mapping issues.  
24. **Code Pagination for Users List** – Server-side pagination.  
25. **Code Sorting for Users List** – Sort by fields like name/email.  
26. **Code Filter Function for Users List** – Search users dynamically.  
27. **Code Export Users to CSV** – Generate downloadable CSV files.  
28. **Code Export Users to Excel** – Integrated Apache POI for Excel.  
29. **Code Export Users to PDF** – Export user list as PDF with iText.  
30. **Update Users Listing for Mobile** – Improved mobile responsiveness.  
31. **Test Users Listing on iPhone** – Verified iOS compatibility.  
32. **Notes about Spring Security Version** – Documented version changes/compatibility.  
33. **Understand Requirement for User Authentication** – Defined login workflow.  
34. **Code User Login Page** – Custom login with Thymeleaf form.  
35. **Code User Authentication** – Integrated Spring Security login.  
36. **Show User's Full Name and Logout Link** – Personalize UI after login.  
37. **Code Logout Function** – Implemented secure logout.  
38. **Enable Remember Me for Login** – Persistent login with cookies.  
39. **Code Update Account Details** – Users can update own profile.  
40. **Test User Authentication on iPhone** – Verified login/logout on iOS.  

### Authorization & Categories  
41. **Understand Requirement for User Authorization** – Planned role-based authorization.  
42. **Code User Authorization Basics** – Restricted access per role.  
43. **Test User Authorization on Smartphone** – Verified authorization rules on mobile.  
44. **Code Custom Error Pages** – Designed 403/404/500 error pages.  
45. **Configure Logging for Admin application** – Setup Logback for monitoring.  
46. **Understand Requirement of Category Module** – Planned hierarchical categories.  
47. **Understand Technical Design for Category Module** – ER model for categories.  
48. **Code Category Entity and Repository** – Implemented persistence.  
49. **Code Unit Tests for Category Repository** – Verified CRUD operations.  
50. **Code for Listing Categories** – Displayed categories list.  
51. **Code Category Form** – UI for creating/editing categories.  
52. **Code Create Category Function** – Save new categories.  
53. **List Categories in Hierarchical Form** – Tree structure display.  
54. **Code Update Category Function** – Modify category details.  
55. **Check Uniqueness of Category** – Prevent duplicate names.  
56. **Code Sort Function for Categories List** – Sort alphabetically.  
57. **Code Update Category Enabled Status** – Enable/disable categories.  
58. **Code Delete Category Function** – Secure deletion.  
59. **Code Pagination for Categories List** – Paged UI.  
60. **Code Filter Function for Categories List** – Search functionality. 

### Category Exports & Brand Module  
61. **Code Export Categories to CSV** – Enabled export of categories to CSV file.  
62. **Make Categories Listing Page Fully Responsive** – Optimized UI for mobile/tablet.  
63. **Understand Requirement of Brand Module** – Planned brand management with linked categories.  
64. **Understand Technical Design for Brand Module** – Designed entity relationship with products/categories.  
65. **Code Brand Entity and Repository** – Created persistence layer for brands.  
66. **Code Unit Tests for Brand Repository** – Verified CRUD operations.  
67. **Code Listing Brands** – Displayed brands in admin panel.  
68. **Code Brand Form** – UI for creating/updating brands.  
69. **Code Category Selection in Brand Form** – Linked brand to categories via dropdown.  
70. **Code Create, Update and Delete Brand Function** – Implemented CRUD operations.  
71. **Check Uniqueness of Brand** – Prevented duplicate brand entries.  
72. **Code Pagination, Sort and Filter for Brands Listing** – Added server-side table controls.  
73. **Make Brands Page Fully Responsive** – Improved UI for smartphones.  
74. **Understand Requirement of Product Module** – Planned detailed product management.  
75. **Understand Technical Design for Product Module** – ER design with multiple relationships.  
76. **Code Product Entity and Repository** – Created product entity & repo.  
77. **Code Unit Tests for Product Repository** – Verified queries and relationships.  
78. **Code Products Listing Page** – Displayed products with pagination.  
79. **Code Product Overview Form** – Added product entry form basics.  
80. **Code Product Form Description and Shipping** – Extended form with description/shipping fields.  

### Product CRUD & Search  
81. **Code Save Product Function** – Persist product details.  
82. **Check Uniqueness of Product** – Avoid duplicate SKUs.  
83. **Update Product Enabled Status** – Toggle availability.  
84. **Code Delete Product** – Remove product with checks.  
85. **Start Coding Upload Product Images** – Added file upload handling.  
86. **Code Upload Product's Main Image** – Saved primary image.  
87. **Code Add Extra Images on Product Form** – UI for additional images.  
88. **Code Upload Product's Extra Images** – Save multiple product images.  
89. **Code Product Detail Entity Class** – Entity for product specifications.  
90. **Code Add Details (Specs) on Product Form** – UI for attributes/specs.  
91. **Code Save Product's Details (Specs)** – Persist product specifications.  
92. **Code Edit Product Function** – Fetch existing details for edit.  
93. **Code Update Product Function** – Save edited details/images.  
94. **Code View Product Details in Modal Dialog** – Preview product details quickly.  
95. **Code Pagination, Sort and Filter for Products Page** – Dynamic table for products.  
96. **Update Category Module for Product Search** – Enhanced search filters.  
97. **Code Filter Products by Category** – Narrow products by category selection.  
98. **Code Authorization for Product Module** – Restricted product features to roles.  
99. **Exercise: Make Products Listing Page Fully Responsive** – Optimized UI for small screens.  
100. **Understand Requirement and Design of Products Listing** – Defined storefront design requirements.  

### Customer-Facing Shop Features & Settings  
101. **Code Home Page for Shopping Application** – Built storefront homepage.  
102. **Code Listing Categories in Home Page** – Display categories to customers.  
103. **Code Listing Products in Category** – Show products by category.  
104. **Code Product Details Page** – Individual product detail page.  
105. **Code Product Images Slideshow** – Carousel for product images.  
106. **Code Search Products Function** – Keyword-based search.  
107. **Understand Requirement and Design of Settings Module** – Planned configurable app settings.  
108. **Code Setting Entity, Repository and Unit Tests** – Persistence for settings.  
109. **Code Currency Entity, Repository and Unit Tests** – Added multi-currency support.  
110. **Code Manage General Settings** – Admin manage global settings.  
111. **Apply General Settings for Shopping Application** – Applied settings to storefront.  
112. **Code Repository Layer for Country and State** – Data persistence for location entities.  
113. **Code Controller Layer for Country** – CRUD endpoints for countries.  
114. **Code Manage Countries** – Admin can add/edit/delete countries.  
115. **Code Controller Layer for State/Province** – CRUD endpoints for states.  
116. **Code Manage States/Provinces** – Admin manage regional data.  
117. **Understand Requirement and Design of Customer Registration** – Planned sign-up flow.  
118. **Code Repository Layer for Customer** – Persistence for customer data.  
119. **Code Customer Registration Form** – UI for new account registration.  
120. **Code Manage E-mail Settings** – Admin can configure SMTP.  

### Customer Registration & Shopping Cart  
121. **Code Send Verification Email** – Trigger verification email after registration.  
122. **Code Verify Customer Account** – Activate customer account via token.  
123. **Test Customer Registration on Smartphone** – Verified mobile flow for sign-up.  
124. **Understand Requirement and Design of Customer Module** – Planned admin/customer management features.  
125. **Code Customer Management Module** – CRUD operations for customers in admin.  
126. **Understand Requirement and Design of Customer Authentication** – Defined customer login/logout needs.  
127. **Code Customer Login and Logout** – Built authentication with Spring Security.  
128. **Update Authentication Type of Customer** – Enabled database + social login methods.  
129. **Understand OAuth 2** – Analyzed OAuth2 flows for external login.  
130. **Code Login with Google** – Integrated Google OAuth2 login.  
131. **Code Login with Facebook** – Integrated Facebook OAuth2 login.  
132. **Code Update Customer's Details** – Allow customers to update profile.  
133. **Code Forgot Password Function** – Added reset password workflow.  
134. **Test Customer Authentication on Smartphone** – Verified login, reset on mobile.  
135. **Understand Requirement and Design of Shopping Cart Module** – Planned cart persistence & UI.  
136. **Code Repository Layer for Shopping Cart** – Created cart entity & repo.  
137. **Code Quantity Control Component** – UI to adjust item quantities.  
138. **Code Add Product to Shopping Cart** – Added product to customer’s cart.  
139. **Code View Shopping Cart** – Display cart items and totals.  
140. **Code Update Product Quantity** – Update quantity with real-time recalculation.  

### Cart Enhancements, Shipping & Checkout  
141. **Code Remove Product from Shopping Cart** – Remove item from cart.  
142. **Format Currency in Shopping Cart** – Applied currency formatting.  
143. **Test Shopping Cart on Smartphone** – Verified cart flow on mobile.  
144. **Understand Requirement and Design of Shipping Rates Module** – Planned shipping calculation.  
145. **Code Shipping Rates Management Module** – Admin manage shipping costs.  
146. **Understand Requirement and Design of Address Book Module** – Defined customer address storage.  
147. **Code Repository Layer for Address Book** – Persistence for addresses.  
148. **Code Address Book Listing** – Show saved addresses.  
149. **Code Add, Edit and Delete Address** – Manage multiple addresses.  
150. **Code Set Default Address** – Choose default address for checkout.  
151. **Test Address Book on Smartphone** – Verified address book UI on mobile.  
152. **Understand Requirement and Design of Order Module** – Planned orders workflow.  
153. **Code Repository Layer for Order Module** – Order persistence.  
154. **Code Orders Listing** – Admin list orders.  
155. **Code View Order Details** – Detailed order view.  
156. **Code Delete Order** – Delete/cancel orders.  
157. **Code Fully-responsive Orders Page** – Optimized orders UI for devices.  
158. **Understand Requirement and Design of Checkout Module** – Defined checkout process.  
159. **Update Shopping Cart Page** – Adjust cart for checkout flow.  
160. **Code Checkout Page** – Built checkout form (address, shipping, payment).  

### Payment & Order Management  
161. **Change Shipping Address from Checkout Page** – Allowed dynamic address changes.  
162. **Update Settings Module** – Added shipping/payment-related configs.  
163. **Code Place Order with COD** – Implemented Cash-on-Delivery option.  
164. **Code Send Order Confirmation E-mail** – Triggered order confirmation mail.  
165. **Create PayPal Accounts** – Setup sandbox accounts for testing.  
166. **Code Payment for Checkout Page** – Integrated PayPal payment.  
167. **Code Validate PayPal Order** – Verified payment completion.  
168. **Review transactions of PayPal sandbox account** – Tested PayPal logs.  
169. **Test Checkout on Smartphone** – Verified end-to-end mobile checkout.  
170. **Understand Remaining Requirement and Design** – Finalized pending modules.  
171. **Update Repository Layer for Order Module** – Added enhancements to repo.  
172. **Display Order Tracking Information** – Show order progress to customer.  
173. **Code Edit Order Form (Overview and Shipping)** – Admin can update order details.  
174. **Code Edit Products in an Order** – Modify items post-purchase.  
175. **Calculate Shipping Cost of a Product** – Auto calculate shipping fees.  
176. **Code Add Products to an Order** – Admin add products to order.  
177. **Code Remove Products from an Order** – Admin remove products from order.  
178. **Code Manage Track Records of an Order** – Track shipment updates.  
179. **Code Save Order into Database** – Persist final order details.  
180. **Understand Requirement and Design of Order Management for Shipper** – Planned shipper’s role module.  

### Shipper Module & Deployment Prep  
181. **Code Orders Listing for Shipper** – Show assigned orders for shipper role.  
182. **Code Service and Controller for Updating Order Status** – Allow shippers to update delivery status.  
183. **Code View Layer for Updating Order Status** – UI for shipper order updates.  
184. **Test Shipper Role on Smartphone** – Verified shipper flow on mobile.  
185. **Understand Requirement and Design of Order Management for Customer** – Planned order history features.  
186. **Code Orders Listing for Customer** – Customers can view all their orders.  
187. **Code View Order Details for Customer** – Display order breakdown.  
188. **Code Return Order Function (Service and Controller)** – Logic for order returns.  
189. **Code Return Order Function (View Layer)** – UI for return request.  
190. **Test Managing Orders on Smartphone** – Verified order management on mobile.  
191. **Understand Key Concepts in Amazon S3** – Reviewed AWS S3 fundamentals.  
192. **Create AWS Account and IAM Users** – Setup secure AWS IAM users.  
193. **Move Existing Image Files to Amazon S3** – Migrated product images to S3.  
194. **Setup AWS SDK for Java** – Added SDK dependency & configuration.  
195. **Code Amazon S3 Utility Class** – Wrote helper class for S3 ops.  
196. **Integrate Amazon S3 Functions** – Used utility in app for file storage.  
197. **Understand Key Concepts in Heroku** – Reviewed Heroku deployment basics.  
198. **Create Heroku Account and Install Heroku CLI** – Setup deployment environment.  
199. **Deploy a Simple App on to Heroku** – Tested with sample Spring Boot app.  
200. **Understand Deployment Approach for Shopme Project** – Designed deployment flow (backend, frontend, DB).  

### Deployment & Sales Reports  
201. **Prepare for Deployment of Shopme Project** – Configured build profiles & JARs.  
202. **Deploy ShopmeBackEnd Project** – Deployed backend service to Heroku.  
203. **Deploy MySQL Database** – Migrated schema to cloud-hosted DB.  
204. **Deploy ShopmeFrontEnd Project** – Deployed UI layer to Heroku.  
205. **Add Custom Domain Names for Apps** – Mapped custom domains.  
206. **Enable Secure Connection (https)** – Enabled SSL/HTTPS.  
207. **Update Social Login with Google and Facebook** – Updated callback URLs for deployment.  
208. **Use Unicode for MySQL Database** – Enabled UTF-8 for multi-language support.  
209. **Understand Requirement and Design of Sales Report Module** – Planned reporting features.  
210. **How to Produce Sales Report** – Defined logic for reports.  
211. **Code Repository Layer for Sales Report** – Implemented data queries for sales.  
212. **Understand Google Charts Library** – Reviewed charting library for UI.  
213. **Code Sales Report by Date** – Showed daily/monthly reports.  
214. **Format Currency for Sales Report** – Applied consistent currency formatting.  
215. **Code Sales Report by Category** – Grouped sales by category.  
216. **Code Sales Report by Product** – Detailed product-level report.  
217. **Test Sales Report on Smartphone** – Verified mobile charts.  
218. **Understand Requirement and Design of Product Review Module** – Planned customer reviews.  
219. **Code Repository Layer for Review** – Persistence layer for reviews.  
220. **Code Review Management for Admin** – Admin can moderate reviews.  

### Reviews, Voting & Dashboard  
221. **Code Review Management for Customer** – Customers can manage their reviews.  
222. **Update Review Count and Average Rating of a Product** – Auto update ratings on new review.  
223. **Show Rating Stars for Products** – Display star ratings in UI.  
224. **Show Reviews in Product Detail Page** – Display customer reviews on product page.  
225. **Code Review Listing of a Product** – Paginated review display.  
226. **Show Review Buttons for Products in Order Details** – Allow reviews only on purchased items.  
227. **Code Write Review Function** – Customers can submit reviews.  
228. **Test Product Review on Smartphone** – Verified review flow on mobile.  
229. **Understand Requirement and Design of Review Voting Module** – Planned voting (helpful/not helpful).  
230. **Repository Layer for Review Voting Module** – Added repo for votes.  
231. **Code Service Layer for Review Voting Module** – Business logic for votes.  
232. **Code Controller Layer for Review Voting Module** – REST endpoints for voting.  
233. **Code View Layer for Review Voting Module** – UI for voting system.  
234. **Update Voting Status for Signed-in Customer** – Track customer’s vote status.  
235. **Sort Reviews** – Sort by most helpful/newest.  
236. **Test Voting Reviews on Smartphone** – Verified on mobile.  
237. **Understand Requirements of Product Question Module** – Planned Q&A section.  
238. **Understand Requirement of Admin Dashboard** – Designed summary dashboard for admin.  
239. **Test Admin Dashboard** – Verified responsiveness and functionality.

## 📂 Project Structure

The **ShopmeProject** is a **multi-module Maven project** designed to separate concerns into reusable modules for backend, frontend, and shared common code. Below is the high-level structure:

```
ShopmeProject/
│── .settings/ # IDE-specific settings (Eclipse/STS)
│── .mvn/wrapper/ # Maven Wrapper configuration
│── mvnw / mvnw.cmd # Maven wrapper scripts for build consistency
│── pom.xml # Parent POM managing all modules
│── .gitignore # Git ignore rules
│── .project # Eclipse project metadata
│── README.md # Documentation file
│
├── ShopmeCommon/ # Common/shared module
│ └── pom.xml # POM for common entities & utilities
│ └── src/ # Shared Java code (entities, utils, exceptions)
│
├── ShopmeWebParent/ # Parent module for web components
│ └── pom.xml # Manages frontend & backend dependencies
│ └── .mvn/wrapper/ # Maven wrapper config for sub-module
│
├── ShopmeBackEnd/ # Backend Admin application
│ ├── src/ # Source code (controllers, services, repos, configs)
│ ├── user-photos/ # Uploaded profile photos of users
│ ├── Shopme-backend.log # Application log file
│ ├── pom.xml # Module-specific dependencies
│ ├── mvnw / mvnw.cmd # Maven wrapper scripts
│ └── .gitignore
│
├── ShopmeFrontEnd/ # Customer-facing storefront application
│ ├── src/ # Source code (controllers, services, views)
│ ├── brand-logos/ # Uploaded logos for brands
│ ├── category-images/ # Uploaded category images
│ ├── product-images/ # Uploaded product images
│ ├── site-logo/ # Logo used for storefront site
│ ├── src/main/resources/ # Static resources & properties
│ ├── pom.xml # Module-specific dependencies
│ ├── mvnw / mvnw.cmd # Maven wrapper scripts
│ └── .gitignore
│  
```

---


### 📌 Explanation of Modules

- **ShopmeCommon**  
  Contains **common entities, enums, utility classes, and exceptions** shared between backend and frontend.  
  Example: `User`, `Role`, `Category`, `Brand`, etc.  

- **ShopmeWebParent**  
  A **parent aggregator POM** for web-related modules (`ShopmeBackEnd` & `ShopmeFrontEnd`).  
  Defines dependency management, plugin versions, and acts as a container.  

- **ShopmeBackEnd** (Admin Panel)  
  - Provides an **administration console** for managing users, categories, products, brands, settings, and orders.  
  - Uses Spring Boot, Spring Security, Spring Data JPA, and Thymeleaf for backend logic and admin views.  
  - Stores uploaded files like **user profile photos**.  
  - Writes logs to `Shopme-backend.log`.  

- **ShopmeFrontEnd** (Customer Storefront)  
  - Provides a **shopping website** for customers (browse products, cart, checkout, payment).  
  - Manages **static images** for brands, categories, products, and site logo.  
  - Uses Spring Boot with Thymeleaf for rendering customer pages.  

- **.mvn/wrapper + mvnw**  
  Maven Wrapper ensures builds run with a consistent Maven version without requiring local installation.  

- **pom.xml (root)**  
  Root **multi-module POM** that aggregates all child modules.  

---

### 🔑 Key Points
- Multi-module design allows **separation of concerns** (common code, backend admin, frontend shop).  
- Easy to maintain and deploy **independent modules**.  
- Upload directories (`user-photos`, `brand-logos`, `category-images`, `product-images`, `site-logo`) are kept at module level for better organization.  

---

# 🛒 Shopme E-commerce Project

Shopme is a **full-stack e-commerce platform** built with **Spring Boot, Maven, and Thymeleaf**.  
It follows a **multi-module architecture** with separate modules for common code, backend admin panel, and customer-facing storefront.

---

## 🚀 Features

### 🔑 Admin Panel (ShopmeBackEnd)
- Manage **Users, Roles, Categories, Brands, Products, Orders, Settings**  
- Upload and manage **user profile photos**  
- Generate admin reports and activity logs  
- Role-based access control with **Spring Security**

### 🛍️ Customer Storefront (ShopmeFrontEnd)
- Browse categories, brands, and products  
- Add to cart, checkout, and place orders  
- Secure payments via **PayPal / Stripe integration**  
- Customer registration, login, and order tracking  
- Product reviews and ratings  
- Responsive UI with **Thymeleaf templates**

### ⚙️ Common Module (ShopmeCommon)
- Shared **entities, enums, constants, and utilities**  
- Centralized model layer for consistency across admin & frontend

---

## 🏗️ Tech Stack

- **Backend**: Spring Boot, Spring Data JPA, Spring Security, Hibernate  
- **Frontend**: Thymeleaf, Bootstrap, HTML, CSS, JS  
- **Database**: MySQL  
- **Build Tool**: Maven (multi-module project)  
- **Deployment**: AWS / Heroku  
- **Payment Gateway**: PayPal / Stripe  
- **Storage**: AWS S3 (images & logos) or local file system  

---

## 📂 Project Structure

👉 Refer to the [Project Structure](#-project-structure) section above for detailed explanation.  

---

## ⚡ Getting Started

### 1️⃣ Prerequisites
Make sure you have the following installed:
- [Java 17+](https://adoptopenjdk.net/)  
- [Maven 3.8+](https://maven.apache.org/)  
- [MySQL 8+](https://dev.mysql.com/downloads/mysql/)  

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/shopme.git
cd shopme
```

### 3️⃣ Configure Database

Update application.properties or application.yml in:
ShopmeBackEnd/src/main/resources/
ShopmeFrontEnd/src/main/resources/

Example:
```
spring.datasource.url=jdbc:mysql://localhost:3306/shopmedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
### 4️⃣ Run the Application

Run from root directory:
```
./mvnw clean install
./mvnw spring-boot:run -pl ShopmeBackEnd
./mvnw spring-boot:run -pl ShopmeFrontEnd
```

Admin Panel: http://localhost:8080
Storefront: http://localhost:8081

### 🧪 Testing

Run unit tests:
```
./mvnw test
```
Integration tests ensure backend + frontend + database work together.

### 🚀 Deployment
On AWS / Heroku:

Package the app:
```
./mvnw clean package
```
Deploy generated .jar files from ShopmeBackEnd/target/ and ShopmeFrontEnd/target/.

### Configure environment variables:
```
DB_HOST, DB_USER, DB_PASS
AWS_ACCESS_KEY, AWS_SECRET_KEY
PAYPAL_CLIENT_ID, PAYPAL_SECRET
```
