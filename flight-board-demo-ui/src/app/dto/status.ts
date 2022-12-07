export class Status {
    id: string | undefined;
    label: string | undefined;
}

export interface StatusResponse {
    _embedded: {
        statuses: Status[];
    }
}