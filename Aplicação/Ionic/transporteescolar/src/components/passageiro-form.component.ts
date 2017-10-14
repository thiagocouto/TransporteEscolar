import {Component, Input} from "@angular/core"

@Component({
    selector: 'component-passageiro-form',
    templateUrl: 'passageiro-form.component.html',
})

export class PassageiroFormComponent{
    _passageiro: any;

    @Input()
    set passageiro(passageiro){
        this._passageiro = passageiro;
    }

    get passageiro(){
        return this._passageiro;
    }
}