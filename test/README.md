# Run acceptenace test
## install selenium for Python
- pip install selenium

## download chromedriver
- https://chromedriver.storage.googleapis.com/index.html?path=98.0.4758.102/

## other prerequisites
- The function Test.test_signup_success(self) requires the specified user to not exist in the database, i.e. The test will only pass the first execution. Override and implement your own Test.remove_user(self, username, driver) function.
- add users with the following credentials (as specified in test.py)
  - applicant
    - username: zven
    - password: 123
  - recruiter
    - username: admin
    - password: 123456

## run tests
- run the web server as usual
- start db
- make sure to override and implement the test above 
- run the following command
  - py test.py

