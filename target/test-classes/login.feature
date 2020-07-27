Feature:
To Validate the login functionality of FB application
Scenario Outline:
User needs to check the login module with valid username and valid password in the facebook page


Given User has to be there in fb page
When User fill the valid "<username>" and "<password>" in the textbox
And once the value passed then click the login button
Then Once the validation done it will redirect you in the homepage

Examples:
|username|password|
|jothi|12345|
|shyam|qwerty|
|mithran|j;lijdf|
|gobi|hkhdf|
|abi|erefddf|