import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Hello world';
  fullname='Testing Input';

  getname(){
    //we can define also function
    return "musaraf";
  }

  imageUrl="https://picsum.photos/200/300";
  imageAlt="angular Logo";

  user = {
    name:'john',
    age:'30'
  }

  clickCount=0;

  clickMe(){
    this.clickCount++;
  }
}
