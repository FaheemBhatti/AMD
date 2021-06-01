import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { User } from '../user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  public user:User[] = [];

  constructor(
    private userService:UserService,
    private router:Router
  ) {}

  ngOnInit(): void {
    this.getUser()
  }


  public loginButton() {
    this.router.navigate([`login`]);
  }

  public getUser(){
    this.userService.getUserList().subscribe(data => {
      this.user = data;
    });
  }
}
