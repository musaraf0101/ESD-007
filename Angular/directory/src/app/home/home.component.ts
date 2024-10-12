import { Component } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  state: boolean = false;
  trigger(): void {
    if (this.state) {
      this.state = false;
    } else {
      this.state = true;
    }
  }
  data: String[] = ['maths', 'tamil', 'english'];
  day: number = 1;

  redcolor: String = 'red';
  size: String = '50px';

  isActive: boolean = true;
}
