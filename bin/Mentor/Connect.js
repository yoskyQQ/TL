function restrestcall1(){
    
    let httpRequest=new XMLHttpRequest();
    httpRequest.open("GET","target file");
    httpRequest.send();
    httpRequest.onload=function (){

        alert(httpRequest.responseText);
    }
    console.log("inside the .js file")
}