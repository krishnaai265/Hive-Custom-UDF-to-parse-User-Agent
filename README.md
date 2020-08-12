# Hive Custom UDF to parse User Agent
-----------------------

### HIVE

* Hive gives a SQL-like interface to manage data. It is used in Amazon H3 file system. It also support HiveQL. Hive implicitly codeword hiveQL statement into Adirected acyclic graph of mapreduce those the spark jobs. <br/>
* It support Advance features such as indices, partition, buckets, asummetric transactions, custom user defined functions, joins, sampling & many others. Lots of them take a considerable amount of time if implemented manually. <br/>


### Adding Jar to HIVE

<img src="Screenshots/adding_jar.png"> <br/>

In the above screenshot, I have added jar to the hive. <br/>

### Create table in hive

<img src="Screenshots/create_table.png "> <br/>

In the above screenshot, I have created table ipinyou. <br/>

### Load Data into table
 
<img src="Screenshots/load_data.png"> <br/>
 
In the above screenshot, I have loaded data into table. <br/>
**load data:** load data command <br/>
**Inpath ‘/hive_hw3/’:** path where data is present <br/>
**Into table ipinyou:** table ipinyou to store data <br/>

### Create Temporary function
 
<img src="Screenshots/create_temporary_function.png"> <br/>

In the above screenshot, have created temporary function strip which point to a java function to execute. <br/>

### Output

<img src="Screenshots/output.png"> <br/>
 
In the above screenshot, we can see that output contains os, browser, ua, device information. <br/>


**Created by:** <br/>
**Name: Krishna Kumar Singh** <br/>
**Email: krishnaai265@gmail.com** <br/>
**Phone: +91-9368754996** 
