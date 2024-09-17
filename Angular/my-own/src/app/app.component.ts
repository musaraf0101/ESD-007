import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'my-own';
  message= 'welcome';
  imageUrl="https://archive.smashing.media/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/d0a4481f-e801-4cb7-9daa-17cdae32cc89/icon-design-21-opt.png";

  showmessage(value:any){
    // alert(value)
    if(value=="on"){
      this.isError=true;
    }
    else{

      this.isError=false;
    }
  }

  isDisable=true;
  isError=true;

  
}
