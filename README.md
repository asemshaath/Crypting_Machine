# UI Preview #
![](https://github.com/asemshaath/Crypting_Machine/blob/main/Screenshots/Encrypting%20Ceasar.png)

# About #
This a Java application that encrypt and decrypt a given word using two diffrent cipher keys. ***Ceasar cipher***, and ***Bellaso cipher***

### Ceasar Cipher ###
Using an integer cyber key. 

### Bellaso Cipher ###
Using a string cyber key. 


# Examples #
### Using Ceasar Cipher ###
Let's try to to encrypt the word "GITHUB" using the number 2 as a cyber key.
The word "GUTHUB" will be encrypted to "IKVJWD". Using the cyber key 2 means that the program will check every character and replace it with the second character that comes after it  

### Using Ceasar Cipher ###
Let's try to to encrypt the word "GITHUB" again. But, we will be using the word "DATA" as a cyber key.
The word "GUTHUB" will be encrypted to "KJ(IYC".
When we use any string cyber key, the cyber key will be either extended or shrinked depends on the length of the given word. In our case, the cyber key will be changed to "DATADAT" to match the length of the word "GITHUB" Then, the program will go over every character in the given word and the new cyber key to add there ascii codes together and generate the encrpyted string.  

# How to install? #
### Requirmnets ###
1) Java 15+
2) Java FX 11+
3) JUnit 5 (if you want to test)
4) An IDE e.g.(IntelliJ, Eclipse)

### Steps ###
1) Clone this repo
2) Copy all .java files into your IDE
3) Run CryptoDriver.java

# Testing #
To test the app, all you need to do is running the CryptingTest.java

# Contribution #
If you want to contribute to this project and make it better with new ideas, your pull request is very welcomed. If you find any issue just put it in the repository issue section, thank you.
