import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { PassageiroDetail } from './passageiro-detail';

@NgModule({
  declarations: [
    PassageiroDetail,
  ],
  imports: [
    IonicPageModule.forChild(PassageiroDetail),
  ],
  exports: [
    PassageiroDetail
  ]
})
export class PassageiroDetailModule {}
