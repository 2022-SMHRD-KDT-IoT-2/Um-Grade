import requests
from flask import Flask, request, render_template

app = Flask(__name__)       # Flask라는 이름의 객체 생성

@app.route('/')             # 클라이언트가 ui창에다가 /로 접속하면 hello함수 호출
def hello():                # /로 실행하면 호출되는 뷰함수
   return "Hello Flask!"    # 뷰함수는 반드시 retrun이 있어야한다.

@app.route('/frontRfid')
def qwer():
    uid = request.args.get("uid")
    print("앞쪽 RFID : "+uid)
    
    URL = 'http://59.0.129.219:8081/umb/frontRfid'
    response = requests.get(URL)
    response.status_code
print(response.text)
    return 0;

@app.route('/backRfid')
def asdf():
    uid = request.args.get("uid")
    print("앞쪽 RFID : "+uid)
    
    URL = 'http://59.0.129.219:8081/umb/backRfid'
    response = requests.get(URL)
    response.status_code
    return"뒤쪽 RFID"


if __name__ == "__main__":  # 직접 main을 실행시키기위한 조건
   app.run(host="0.0.0.0", port = "8082")