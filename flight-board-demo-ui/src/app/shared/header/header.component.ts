import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  username: string = '';
  password: string = '';
  hideLogin: boolean = false;
  showAdminFeature: boolean = false;

  onSubmitLoginForm() {
    if(this.username === this.password) {
      this.username = '';
      this.password = '';
      this.hideLogin = true;
      this.showAdminFeature = true;
    }
  }

}