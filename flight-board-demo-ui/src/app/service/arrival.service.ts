import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ArrivalService {

  private baseUrl = "http://localhost:8080/api/arrivals";

  constructor(private http: HttpClient) { }

  public save(arrival: Arrival) {
    return this.http.post<Arrival>(this.baseUrl, arrival);
  }

}