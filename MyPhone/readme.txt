United States phone number string type in E.164 format

While solving the current problem, I did my research on E164 format via following links:

http://searchnetworking.techtarget.com/definition/E164
https://www.itu.int/ITU-D/treg/Events/Seminars/2010/Ghana10/pdf/Session2.pdf

I came across one solution where I can match it with regex pattern which seems a great solution to me.
Regex String :  ?:\\+?1[-. ]?)?\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})
which satisfies most of the criterias needed for E.164 format.

Once my program was working fine, I looked further into web for better approaches to solve the problem and came across Google's library which works
with Phone Numbers 
Library: https://github.com/googlei18n/libphonenumber
so, I used this library which provides a better solution to produce the format in International, National and E164 formats.

My function convertToE164Number takes input string provided by user and returns API's PhoneNumber format which can be further formatted into 
above mentioned forms.


Tests:

Enter your number 
7887887889
Number in International format: +1 788-788-7889
Number in National format: (788) 788-7889
Number in E164 format: +17887887889


Enter your number 
679y99
Number is invalid

