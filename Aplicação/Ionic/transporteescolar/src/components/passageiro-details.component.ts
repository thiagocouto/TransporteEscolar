import {Component, Input} from "@angular/core"

@Component({
    selector: 'component-passageiro-details',
    templateUrl: 'passageiro-details.component.html',
})

export class PassageiroDetailsComponent{
    _passageiro: any;

    @Input()
    set passageiro(passageiro){
        this._passageiro = passageiro;
    }

    get passageiro(){
        return this._passageiro;
    }
}