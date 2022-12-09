import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Arrival } from '../model/arrival';

@Injectable({
  providedIn: 'root'
})
export class ArrivalService {

  private baseUrl = "http://localhost:8080/api/arrivals";

  constructor(private http: HttpClient) { }

  public save(arrival: Arrival) {
    return this.http.post<Arrival>(this.baseUrl, arrival);
  }

  findAll(): Observable<any>{
    return this.http.get<any>(this.baseUrl+'?size=5000');
  }
  
}