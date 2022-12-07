import { Component, OnInit } from '@angular/core';
import { Status } from 'src/app/dto/status';
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

  constructor(private statusService: StatusService) {
  } 

  ngOnInit() {
    this.statusService.getArrivalStatuses().subscribe(data => {
      this.statuses = data._embedded.statuses;
    });
  }

  onSubmit() {
    console.log(this.scheduled + ', ' + this.status + ', ' + this.origin + ', ' + this.revised + ', ' + this.airline + ', ' + this.route);
  }

}