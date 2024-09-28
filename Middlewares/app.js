const express =require("express");
const app=express();

app.use(()=>{
    console.log("Hi,I am middleware");
});

app.get("/",(req,res)=>{
    req.send("Hi, I am root");
});

app.get("/random",(req,res)=>{
    res.send("this is a rondom page");
});

app.listen(8080,()=>{
    console.log("server listing to port 8080");
});