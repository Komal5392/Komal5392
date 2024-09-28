/*const object={
    message: 'Hello, World!',
    logMessage(){
        console.log(this.message);
    }
};
setTimeout(object.logMessage,1000);*/
let length=4;
function callback(){
    console.log(this.length);
}
const object={
    length:5,
    method(callback){
        callback();
    }
};
object.method(callback,1,2);