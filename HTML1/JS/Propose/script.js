/*const max=prompt("enter the max number");
const random=Math.floor(Math.random() * max)+1;
let guess=prompt("guess the number");

while(true){
    if(guess=="Quit"){
        console.log("user Quit the game");
        break;
    }
    if (guess==random){
        console.log("You are right! congrats!!",random);
        break;
    }
    else if(guess<random){
       guess= prompt("Your guess was too small, Try again");
    }
    else{
        
        guess=prompt("Your guess is too large, Try again");
    }
}

do{
    
}*/

/*function printTable(n){
    for (let i=1;i<=10;i++){
        table=n*i;
        console.log(n+"*"+i+"="+table);
    }
}

printTable(5);*/

function getSum(n){
    let add=0;
    for (let i=1;i<=n;i++){
        add=add+i;
    }
    return add;
}

getSum(7);

/*const yesbutton= document.getElementById('yes');
const nobutton= document.getElementById('no');
const cta=document.querySelector('.buttons');

noButton.addEventListener('mouseenter',()=>{
    const yesIndex=Array.from(cta.children).
    indexOf(yesButton);
    const noIndex=Array.from(cta.children).
    indexOf(noButton);
    
    if(yesIndex<noIndex){
    cta.insertBefore(noButton, yesButton);
    }
    else{
        cta.insertBefore(yesButton, noButton);
        }
})*/