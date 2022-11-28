CS1课堂笔记

2022 09 26
	回顾：
		Hibernate ch5
			事务
				四大特性
				事务的状态
				事务的方法
				事务的配置
				事务的并发
					并发的问题
						a 脏读：读取到其他事务已save但未commit的数据。Hibernate瞬态-->持久态oid已分配

						b 丢失更新：不同事务同时获取相同数据，更新不同内容，先后提交产生覆盖
	
						c 不可重复读：有事务连续读取数据期间，该数据被其他事务修改。 
	
						d 幻读：有事务连续读取数据期间，该数据被其他事务删除。 
	
					并发隔离机制
						1 未提交读: 
						2 读已提交: a    只能读已提交或已修改的数据
						4 重复读: a b c  只能读已提交,不能读已修改的数据
						8 序列化: abcd  不让并发，可以读  
	
					锁机制
						乐观锁：提交验证机制，只有一个事务修改数据
							timestamp
							version int
							乐观：不同事务可以同时读取数据，只有第一个提交的可以修改数据。
	
						悲观锁：串行化的假并发，t1先读上锁，t2不可同时读(SQL打印但未执行)，t1 commit，t2.get()执行，先后更新。
							LockMode{
								NONE,READ,UPDATE,WRITE;
							}
							悲观：只让一个事务读数据


	今日内容：
		maven
			配置：
	
			IDEA使用：


		反射：
			概念：
	
			动态语言：
	
			类对象的获取方式：
	
			重要的类、API：
	
			类的加载流程：
	
			类加载器：


		A.maven配置：
			1.下载解压
			2.创建Repository目录
			3.配置maven环境变量
				cmd mvn -v验证
			4.conf/settings.xml
				写入 localRepository值：D:\DevTools\Java\apache-maven-3.6.3\Repository
				添加mirror 仓库镜像
				<mirror>
	  				<id>nexus-aliyun</id>
	  				<name>nexus-aliyun</name>
	  				<url>http://maven.aliyun.com/nexus/content/groups/public</url>
	  				<mirrorOf>central</mirrorOf>
				</mirror>
				<!-- 阿里云仓库 -->
				<mirror>
	  				<id>alimaven</id>
	  				<mirrorOf>central</mirrorOf>
	  				<name>aliyun maven</name>
	  				<url>http://maven.aliyun.com/nexus/content/repositories/central/</url>
				</mirror>


		B.IDEA使用：
			打开：file---> settings ---> Build execution deployment --> build tools --> maven
	
		C.Maven基础
	
			构建工具：  ant --> maven --> Gradle
	
				jar包管理：
					导包、下载
	
					远程仓库：中央仓库（阿里）
					本地仓库：maven\repository
	
				项目生命周期管理：
					清理 编译 测试 打包等操作


		D.反射：
			用途：框架都用到了反射
	
			概念：	
				程序在执行期间可以获取类的结构信息，直接操作类的属性，构造器，成员方法等等；
				功能强大，性能降低。
	
				import  Class  --->   new Instance ---> object.invokeMethod();
	
				Instance --getClass()-->  类对象  XXX.class(内存中一个类只有一份.class缓存) 
										  （某个类的结构）---> 结构
	
			Class和Object：
				Class是个类：用于描述所有类的结构的类，像镜子一样把一个对象的类的结构信息照出来，然后操作它。
				Class的实例 叫类对象
	
			动态语言：
				在执行时可以修改代码结构的语言，反射让静态语言java具有动态特性
	
			类对象的获取方式：
	
			重要的类、API：
	
			类的加载流程：
	
			类加载器：

![image-20221003184144607](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184144607.png)

![image-20221003184202774](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184202774.png)

![image-20221003184512010](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184512010.png)



![image-20221003184112808](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184112808.png)



![image-20221003184130144](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184130144.png)

![image-20221003184228598](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003184228598.png)

![image-20221003190658882](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003190658882.png)

![image-20221003190831630](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003190831630.png)

![image-20221003190843335](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003190843335.png)



![image-20221003191001790](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003191001790.png)

5   容器实现类

​		maven项目xml存放于resources目录下

![image-20221003191120344](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221003191120344.png)

2022 10 3

​			4.作用域scope

​			5.FactoryBean

​			6.Bean生命周期

​			![image-20221006081512645](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221006081512645.png)

​			6

​				1>实例化Bean

​				2>设置Bean属性

​				3>前置处理（BeanPostProcessor)

​				4>Bean初始化

​					自定义init（）

​					InitlizingBean接口（init())

​				5>后置处理(BeanPostProcessor)

​				6>使用Bean

​				7>销毁Bean(DisposableBean接口的destory())

​										自定义的destory方法

​										IOC容器（实现类上下文对象）close()；	

​						BeanDifinition---（底层）

​			7自动装配（依赖）

​				bean属性autowire

​					bytype:自动根基引用属性的类型进行装配，装入值须唯一

​					byName:

​			8组件扫描

​				Bean类型：

​					业务Bean：操作，行为

​						controller /service /Dao

​					实验Bean：传输，存储数据

​						bean /

![image-20221006093317682](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221006093317682.png)

@Value:设置实体属性默认值

自动注入：

​		@Autowired:按类型注入

​		@Qualifier:按名称注入（和上方同时使用）

​		@Resourece:名称，类型（jdk）

![image-20221006085712217](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221006085712217.png)









## 10.7

AOP：

![image-20221010193547682](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221010193547682.png)

​		1.代理模式Proxy：

​			中介

![image-20221007142550774](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221007142550774.png)

​				AOP

​			1>静态模式

​				固态代理

​				1>目标类和代理类需要实现相同的接口

​				2>代码冗余121

​			2> 动态模式

​				通用代理

​					1>jdk基于接口实现

​							Proxy/使用JDK接口InvocationHa

​					![image-20221007191546562](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221007191546562.png)

​		

​					字节码

​			2.AOP（面向切面编程）

![image-20221007193122189](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221007193122189.png)

​				Joinpoint



​		2.AOP相关概念及流程

​		3.五大通知

​		4.AOP基于XML 的实现

​		5.AOP基于XML（JoinPoint）

​		AOP 的全注解实现

![image-20221010192837930](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221010192837930.png)

6，执行顺序

![image-20221010194207461](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221010194207461.png)

​		说明：有异常时，环绕后置不执行

​					无论什么情况，最终通知都执行

​					后置通知和异常通知只会执行一个

​		7.通知用途

​			事务，日志，异常

Demo

​		1.JoinPoint	

​		2.注解+XML实现

​			AOP注解

​				@Aspect：加在切面类上

​				@PointCut：指定测定通过用于哪些方法

​					value=（execution（ReturType

​				五大通知

​						@Before,After,AfterReturning,AfterThrow,Around

​				@Order

## 10.14



![image-20221013140803203](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221013140803203.png)

![image-20221014160426149](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221014160426149.png)

![image-20221014160541853](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221014160541853.png)

![image-20221014143351623](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221014143351623.png)

![image-20221014160402179](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221014160402179.png)

##  10.17

![image-20221019225800382](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221019225800382.png)

![image-20221019225908317](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221019225908317.png)

​             <img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221019225942113.png" alt="image-20221019225942113" style="zoom: 90%;" /> 

  

1. propagation 事务的传播行为7种

   ​	事务方法：包含写操作的方法

   ​	描述：多事务方法直接调用，这个过程中的事务如何管理

   ​	Required  默认值：

   ​					外部方法m1(有事务) 调用方法m2(无事务),m2使用m1的事务

   ​					外部方法m1(无事务) 调用方法m2(无事务),创建新事务

   ​					--有就用，没有就创建

   ​	Required_New

   ​					m1调用m2方法时，m2总是会创建新事物

   ​					--不管有没有，m2都创建

   ​	Supports

   ​					m1（有事务），m2用m1的。m1没有事务，m2也可以没有（有就用，没有也行）

   ​	Not_supported		

   ​					m2不在事务中执行，m1有事务就将其挂起

   ​	Never

   ​					m2不在事务中执行，m1有事务就抛异常

   ​	Mandatory

   ​					m2必须在事务中执行，没有就抛异常

   ​	Nested

   ​					m1有事务，m2内嵌m1中执行，没有就新建

2. isolation            隔离机制

   ​	0

   ​	1

   ​	2

   ​	4  重复读 --- mysql默认等级

   ​	8

3. timeout           超时

   ​	-1   不超时

   ​	正值    超时  秒

4. readOnly           只读

   ​     默认     false    crud

   ​					true      只能查

5. roollback          回滚

   ​	对那些类会回滚

6. noRollback        不回滚

   ​	对那些类不回滚

## 10.21



![image-20221021134035007](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221021134035007.png)

![image-20221021134103766](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221021134103766.png)

![image-20221021134119267](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221021134119267.png)

![image-20221021134227667](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221021134227667.png)

  B.Demo1-----HelloWorld

​	C.注解：

​			@RequestMapping

​			接参，传参

​	D，拦截器，消息转换器，过滤器，文件上传





![image-20221024184647350](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221024184647350.png)

![image-20221024184801470](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221024184801470.png)

![image-20221024184843073](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221024184843073.png)

​			在SpringMvc后台进行获取数据

​			用来获取Cookie中的值

​			可以将请求头中变量值映射到控制器的参数中

​			将java对象转为json格式的数据

​			主要用来接收前端传递给后端的请求体中的数据

​			指该类中所有的[API](https://so.csdn.net/so/search?q=API&spm=1001.2101.3001.7020)接口返回的数据，以Json字符串的形式返回给客户端



## 10.24

![image-20221027001407892](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221027001407892.png)

![image-20221027001548208](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221027001548208.png)

![image-20221027001753263](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221027001753263.png)

![image-20221027140200453](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221027140200453.png)

![image-20221027140334572](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221027140334572.png)

![image-20221028134310006](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221028134310006.png)

![image-20221028134628026](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221028134628026.png)

## 10.28

回顾

![image-20221028140759116](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221028140759116.png)

任务

 A .rest风格

​      rpc风格

​		restful api

​		@Pathvariable

​	

​		07-----11    				13											19

​		web网站									前后端分离									大数据

​		2G/3G						4G											5G

​		手机上网			Andriod、ios          小程序







接口规范

​										RPC												 REST		 B请求                S过滤

查询				getUserById/getUserByName					user/1		get				   get

保存				saveUser														user			post				post

更新				updateUser								  				 user			post				 put

删除				deleteUserById											 user			post				delete

REST（Representational state transfer）:表述层资源状态转移





前端请求--->后端：业务逻辑调数据   		--->缓存-->  数据库

实现基础RESTful Demo

​		1.Controller处理器方法

​		2.方法过滤器的配置（解析http动作）

​		3.发起请求（http动作）

​				<input type="hidden" name="_method" value="PUT/DELETE>

JSF：XHTML -----> HTML(包含一些type=hidden的input)

Put:  HTML(包含一些type=hidden的input) ----- >SpringMVC中methodFilter识别



​	a.SpringMVC执行流程

​	b.基础配置:依赖，web项目，六大组件

​	c.第一个例子

​	d.接收参数：

​		@RequestMapping及其属性

​			@RequestParam

​			@RequestHeader

​			@CookieValue

​	e,消息转化器

​		@RequestBody

​		@ResponseBody

​		@JsonAlias

​		@JsonProperty

​		postman的使用

​	f.域对象

​	g.数据域

​			ModelAndview

​			Modelmap,Model,Map -----》 BindinAwareModelMap

​	h.restful使用

-------

​	i.文件上传

​	j.静态资源放行，视图控制

​	k.拦截器

​	l.异常处理

​	m.全注解



## 10.31



回顾

​		1.Restful是什么

​			url接口声明，动作词  --》 名词，接口简化

​		2.@RestController

​			=@Controller + @ResponseBody

​			前端                       后端

​				     ----json---> |fastjson| Object实体

​					 <---json---	|消息转换器|

​		3.消息转换器中的两个类

​				ResquestEntity<>:接受http请求中的数据（header，body)

​				ResponseEntity<>：接受http响应中的数据（header，body)

​	任务：

​		1.项目技术架构

​			SpringMVC/SpringBoot

​		2.文件上传、下载

​				上传

​						<1>,依赖

​						<2>,文件解析器的配置

​						<3>,页面

​							enctype

​							数据格式

​						<4>,handler

​						<5>,存储路径



​		A。文件上传

​				页面设置三个内容

​				enctype

​				数据格式：

​					结构化数据

​							<input type="text" />

​						关系数据库

​						表单中的数据，Map<k,v>

​					半结构化数据：

​						xml格式

​						json格式

​					非结构化数据：

​						音频，视频，二进制文件

## 11.3





![image-20221103085419548](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221103085419548.png)

![image-20221103091134707](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221103091134707.png)

![image-20221103091658045](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221103091658045.png)

## 11.4

![image-20221104121818896](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221104121818896.png)

![image-20221104140655514](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221104140655514.png)

![image-20221104143719050](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221104143719050.png)

</h:dataTable>

​		EL 表达式：方法表达式传参

B，核心标记库：提供强化组件的功能

​		<1>选择标记

​				<f:selectItem itemLabel=" " itemValue=" "/>

​		<2>facet

​		<3>验证器

​		<4>







## 11.10

![image-20221110135359541](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221110135359541.png)

​	![image-20221110135251077](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221110135251077.png)

​	

![image-20221110135434049](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221110135434049.png)

![image-20221111135728537](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221111135728537.png)

![image-20221111135654806](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221111135654806.png)

![image-20221111135617084](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221111135617084.png)



## 11.11

 SpringMVC拦截器

​		拦截器

​		静态资源放行



​		aop	:

​				对service层加强（异常，事务，日志）

​				对controller层加强：拦截器

​						handler方法执行前后

​		dispatchServlet

​				SpringMVC中的servlet

​				servlet一般由web容器



## 11.14

![image-20221117081310530](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221117081310530.png)

![image-20221117081202441](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221117081202441.png)





## 11.17

​	A，jsf遵循MVC设计模式

​		SpringMVC 中： MV     C

​		JSF中：CM常在一个地方



​	B，值更改事件

​			实现方式

​				1.实现