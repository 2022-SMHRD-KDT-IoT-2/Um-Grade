import requests
URL = 'http://tistory.com'
response = requests.get(URL)
response.status_code
print(response.text)
