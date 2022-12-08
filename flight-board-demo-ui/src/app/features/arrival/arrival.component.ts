import { Component, OnInit } from '@angular/core';
import { Airport } from 'src/app/dto/airport';
import { Status } from 'src/app/dto/status';
import { AirportService } from 'src/app/service/airport.service';
import { StatusService } from 'src/app/service/status.service';

@Component({
  selector: 'app-arrival',
  templateUrl: './arrival.component.html',
  styleUrls: ['./arrival.component.css']
})
export class ArrivalComponent implements OnInit {

  scheduled: string = '';
  status: string = '';
  origin: string = '';
  revised: string = '';
  airline: string = '';
  route: string = '';

  statuses: Status[] | undefined;
  airports: Airport[] | undefined;

  constructor(private statusService: StatusService, private airportService: AirportService) {
  } 

  ngOnInit() {
    this.statusService.getArrivalStatuses().subscribe(data => {
      this.statuses = data._embedded.statuses;
    });

    this.airportService.findAll().subscribe(data => {
      this.airports = data._embedded.airports;
      console.log(this.airports);
    });
  }

  onSubmit() {
    console.log(this.scheduled + ', ' + this.status + ', ' + this.origin + ', ' + this.revised + ', ' + this.airline + ', ' + this.route);
  }

}