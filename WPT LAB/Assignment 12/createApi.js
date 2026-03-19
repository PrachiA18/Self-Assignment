const http = require('http');
const url = require('url');

const s1 =  http.createServer(handleData);
let myData = [ 21,12,43,18,45,11];

function handleData(request,response){
  console.log(request.method);
  if (request.method == 'GET') {

        if (request.url == '/') {
            response.write("Hello From Server")
        }

        if (request.url == '/getData') {
            response.write("Data " + myData)
        }


    }
    if (request.method === 'POST') {
        const urlData = url.parse(request.url, true)
        console.log(urlData)
        const queryParams = urlData.query;
        let data = queryParams.num;

        console.log(urlData.pathname)
        // parse 

        if (urlData.pathname === '/home') {
            response.write("Home Page")
            myData.push(data);
        }

    }

    response.end();

}
s1.listen(5050, () => {

    console.log("Server Started ")

});