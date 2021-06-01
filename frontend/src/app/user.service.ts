import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { OptionsService } from 'shared/options.service';
import { User } from './user.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor( 
    private readonly httpClient:HttpClient , 
    private readonly _optionService: OptionsService
    ) {}

    public getUserList(): Observable<User[]> {
      return this.httpClient.get<User[]>(`${this._optionService.baseUrl}/user`); 
    }
}
