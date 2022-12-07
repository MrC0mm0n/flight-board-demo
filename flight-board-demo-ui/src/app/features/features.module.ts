import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ArrivalComponent } from './arrival/arrival.component';
import { DepartureComponent } from './departure/departure.component';



@NgModule({
  declarations: [
    ArrivalComponent,
    DepartureComponent
  ],
  imports: [
    CommonModule
  ]
})
export class FeaturesModule { }
