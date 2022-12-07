import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ArrivalComponent } from './arrival/arrival.component';
import { DepartureComponent } from './departure/departure.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    ArrivalComponent,
    DepartureComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ]
})
export class FeaturesModule { }
