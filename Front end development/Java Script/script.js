// object creration
// const person={

//     name: "John",
//     lastname:"silva",
//     age:30,
//     isEmployee:true,
//     sayHello:function(){
//         console.log("Hi, i'm john");
//         //it's object function
//     }
// }


// const person2={

//     name: "nowsath",
//     lastname:"musaraf",
//     age:22,
//     isEmployee:false,
//     // area:trincomalee -> area is key : trincomalee is value
//     Hello:function(){
//         console.log(`Hi, i'm ${this.lastname} `);
//         //it's object function
//     }
// }

// console.log(person.lastname)
// console.log(person.age)
// console.log(person.isEmployee)
// console.log(person.name);
// console.log(person.sayHello());
// console.log(person2.Hello());

function person(name,lastname,age){
    this.age=age;
    this.name=name;
    this.lastname=lastname;
    //inside the constuctor we can create function also
    this.sayHello=function(){
        console.log(`Hi, i'm ${this.name} `)
    }
}

const person= new person("musaraf","nowsath",22);

console.log(person.name);
console.log(person.lastname);
console.log(person.age);
person.sayHello;